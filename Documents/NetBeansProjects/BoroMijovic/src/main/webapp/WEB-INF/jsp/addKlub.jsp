<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>



<%@include file="headerH.jsp" %>
<h1>Add klub</h1>
<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <c:url var="addKlub" value="/addKlub" ></c:url>
        <form:form method="POST" modelAttribute="klub">
            <% String success = (String) request.getAttribute("successMsg");%>
            <%= (success != null) ? "<div class=\"alert alert-success\">" + success + "</div>" : ""%>
            <div class="form-group">
                <form:input type="hidden" id="id_klub" class="form-control" placeholder="id_klub" path="id_klub" />
                <form:label path="naziv_klub">
                    Naziv klub
                </form:label>
                <form:input type="naziv_klub" class="form-control" id="naziv_klub" placeholder="naziv_klub" path="naziv_klub" />
            </div>
            <div class="form-group">
                <form:label path="adresa_klub">
                    Adresa klub
                </form:label>
                <form:input type="adresa_klub" class="form-control" id="adresa_klub" placeholder="adresa_klub" path="adresa_klub" />
            </div>
            <div class="form-group">
                <form:label path="kontakt_telefon">
                    kontakt telefon
                </form:label>
                <form:input type="kontakt_telefon" class="form-control" id="kontakt_telefon" placeholder="kontakt_telefon" path="kontakt_telefon" />
            </div>
            <div class="form-group">
                <form:label path="naziv_stadion">
                    naziv stadiona
                </form:label>
                <form:input type="naziv_stadion" class="form-control" id="naziv_stadion" placeholder="naziv_stadion" path="naziv_stadion" />
            </div>

            <button type="submit" class="btn btn-primary">ADD</button>
        </form:form>
    </div></div>
<%@include file="footerH.jsp" %>