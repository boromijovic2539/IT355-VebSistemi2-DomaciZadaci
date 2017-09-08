<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prikaz podataka</title>
    </head>

    <%@include file="header.jsp" %>
    <h2>Podaci o sobi</h2>
    <table>
        <tr>
            <td>Broj kreveta</td>
            <td>${kreveti}</td>
        </tr>
        <tr>
            <td>Velicina</td>
            <td>${velicina}</td>
        </tr>
        <tr>
            <td>Klima</td>
            <td>${klima}</td>
        </tr>
        <tr>
            <td>Kupatilo</td>
            <td>${kupatilo}</td>
        </tr>
        <tr>
            <td>Tv</td>
            <td>${tv}</td>
        </tr>
        <tr>
            <td>Cena po danu</td>
            <td>${cenaPoDanu}</td>
        </tr>
    </table>
    <%@include file="footer.jsp" %>
