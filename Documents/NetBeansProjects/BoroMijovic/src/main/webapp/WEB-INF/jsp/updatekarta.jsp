<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/add.css" />" rel="stylesheet"  type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <form:form method="POST" modelAttribute="karta">
            <div style="float:left;">
                <form:label path="id_karta">ID</form:label>
                <form:input  id="id_karta"  path="id_karta" readonly="true"/>
            </div>
            <div style="float:left;">
                <form:label path="domacin">Domacin</form:label>
                <form:input  id="domacin"  path="domacin" />
            </div>
            <div style="float:left;">
                <form:label path="gost">Gost</form:label>
                <form:input id="gost"  path="gost" />
            </div>
            <div style="float:left;">
                <form:label path="vreme_utakmice">Vreme utakmice</form:label>
                <form:input id="vreme_utakmice" path="vreme_utakmice" />
            </div>
            <div style="float:left;">
                <form:label path="cena_karte">Cena</form:label>
                <form:input id="cena_karte" path="cena_karte" />
            </div>
            <div style="float:left;">
                <form:label path="sektor">Sektor</form:label>
                <form:input id="sektor" path="sektor" />
            </div>
            <div style="float:left;">
                <form:label path="broj_sedista"> Broj sedista</form:label>
                <form:input id="broj_sedista" path="broj_sedista" />
            </div>

            <div style="float:left;">
                <button type="submit">Dodaj</button>
            </div>
        </form:form>
    </body>
</html>