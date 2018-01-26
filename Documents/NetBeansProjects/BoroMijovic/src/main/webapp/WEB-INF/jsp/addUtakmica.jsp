<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="headerH.jsp" %>
<h1>Add utakmica</h1>
<c:url var="addUtakmica" value="/addUtakmica" ></c:url>
    <div class="container">
        <div class="col-md-6 col-md-offset-3">

        <c:url var="post_url"  value="/addUtakmica/" />
        <form:form method="POST" action="${post_url}" modelAttribute="utakmica">
<% String success = (String) request.getAttribute("successMsg"); %>
              <%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
            <div class="form-group">
                 <form:input type="hidden" id="id_utakmica" class="form-control" placeholder="id_utakmica" path="id_utakmica" />
                <form:label path="vreme_utakmice">
                    Vreme utakmice
                </form:label>
                <form:input type="vreme_utakmice" id="vreme_utakmice" class="form-control" placeholder="vreme_utakmice" path="vreme_utakmice" />
            </div>
            <div class="form-group">
                <form:label path="gostujuci_tim">
                    Gostujuci tim
                </form:label>
                <form:input type="gostujuci_tim" id="gostujuci_tim" class="form-control" placeholder="gostujuci_tim" path="gostujuci_tim" />
            </div>
            
            <div class="form-group">
                <form:label for="klub" path="klub">Klubovi</form:label>

                <form:select id="slcRole" class="form-control" path="klub">
                      <form:option value="">SELECT</form:option>
                    <form:options items="${klubovi}" itemValue="id_klub" itemLabel="naziv_klub" />
                </form:select>
            </div>
            <button type="submit" class="btn btn-primary">ADD</button>
        </form:form>
    </div>
</div>
<%@include file="footerH.jsp" %>