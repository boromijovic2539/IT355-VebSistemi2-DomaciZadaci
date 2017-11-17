<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp" %>
<html>
    <head>
        <title>Unos nove karte</title>
    </head>
    <body>
        <h2>Dodaj novu kartu</h2>
        <form:form method="POST" action="/BoroMijovic/addKarta">
            <table>
                <tr>
                    <td><form:label path="domacin">Domacin: <spring:message code="domacin"/></form:label></td>
            <td><form:input path="domacin" /></td>
        </tr>
        <tr>
            <td><form:label path="gost">Gost: <spring:message code="gost"/></form:label></td>
    <td><form:input path="gost" /></td>
</tr>
<tr>
    <td><form:label path="vreme_utakmice">Vreme utakmice: <spring:message code="vreme_utakmice"/></form:label></td>
<td><form:input path="vreme_utakmice" /></td>
</tr>
<tr>
    <td><form:label path="cena_karte">Cena karte: <spring:message code="cena_karte"/></form:label></td>
<td><form:input path="cena_karte" /></td>
</tr>
<tr>
    <td><form:label path="sektor">Sektor: <spring:message code="sektor"/></form:label></td>
<td><form:input path="sektor" /></td>
</tr>
<tr>
    <td><form:label path="broj_sedista">Broj sedista: <spring:message code="broj_sedista"/></form:label></td>
<td><form:input path="broj_sedista" /></td>
</tr>
<tr>
    <td colspan="2">
        <input type="submit" value="Pošalji"/>
    </td>
</tr>
</table>
</form:form>
</body>
</html>
<%@ include file="footer.jsp" %>