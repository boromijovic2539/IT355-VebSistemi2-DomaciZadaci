
<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="header.jsp" %>
<h2>Unesite informacije o sobi</h2>
<form:form method="POST" action="/PrviDomaci/addSoba" commandName="soba">
    <table>
        <tr>
            <td><form:label path="brojKreveta">Broj kreveta:</form:label></td>
            <td><form:input path="brojKreveta" /></td>
        </tr>
        <tr>
            <td><form:label path="velicina">Velicina:</form:label></td>
            <td><form:input path="velicina" /></td>
        </tr>
        <tr>
            <td><form:label path="klima">Klima:</form:label></td>
            <td><input type="radio" name="klima" value="true" path="klima" />Ima</td>
            <td><input type="radio" name="klima" value="false" path="klima" />Nema</td>
        </tr>
        <tr>
            <td><form:label path="kupatilo">Kupatilo:</form:label></td>
            <td><input type="radio" name="kupatilo" value="true" path="kupatilo" />Ima</td>
            <td><input type="radio" name="kupatilo" value="false" path="kupatilo" />Nema</td>
        </tr>
        <tr>
            <td><form:label path="tv">Tv:</form:label></td>
            <td><input type="radio" name="tv" value="true" path="tv" />Ima</td>
            <td><input type="radio" name="tv" value="false" path="tv" />Nema</td>
        </tr>
        <tr>
            <td><form:label path="cenaPoDanu">Cena po danu:</form:label></td>
            <td><input name="cenaPoDanu" path="cenaPoDanu" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Pošalji"/>
            </td>
        </tr>
    </table>
</form:form>
<%@include file="footer.jsp" %>