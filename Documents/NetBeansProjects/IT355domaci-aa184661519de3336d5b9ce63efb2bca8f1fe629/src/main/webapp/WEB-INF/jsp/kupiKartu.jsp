<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/resources/add.css" />" rel="stylesheet"  type="text/css" />
    <link href="<c:url value="/resources/slider.css" />" rel="stylesheet"  type="text/css" />
    <title>Kupi kartu Page</title>

</head>
<%@include file="header.jsp" %>

<div class = "karts" style="width: 100%; display: block; background-color: gray; margin-left: 15px; "> 
    <div style=" margin-left: 20px;">
        <img src="<c:url value='/resources/ticket.jpg'/>" style="float: left; width:400px;">    
    </div>

    <div style="width: 100%; background-color: gray; margin-left: 40px;">
        <form:form method="POST" modelAttribute="karta">
            <div class="polja" style="float:left;">
                <form:label path="id_karta">ID</form:label>
                <form:input  id="id_karta"  path="id_karta" readonly="true"/>
            </div>
            <div class="polja" style="float:left;">
                <form:label path="vreme_utakmice">Vreme</form:label>
                <form:input  id="vreme_utakmice"  path="vreme_utakmice" readonly="true" />
            </div>
            <div  class="polja" style="float:left;">
                <form:label path="gostujuci_tim">Gost</form:label>
                <form:input id="gostujuci_tim"  path="gostujuci_tim"  readonly="true"/>
            </div>
            <div  class="polja" style="float:left;">
                <form:label path="cena_karte">Cena</form:label>
                <form:input id="cena_karte" path="cena_karte"  readonly="true"/>
            </div>
            <div  class="polja"style="float:left;">
                <form:label path="broj_karata">Broj karata</form:label>
                <form:input id="broj_karata" path="broj_karata" />
            </div>
            <div class="polja" style="float:left;">
                <button type="submit">Dodaj</button>
            </div>
        </form:form>
    </div>

</div>
<%@include file="footer.jsp" %>