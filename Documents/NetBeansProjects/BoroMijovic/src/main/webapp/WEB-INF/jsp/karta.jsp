<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>
    <head>
        <title>Prikaz karte</title>
    </head>
    <body>
        <h2>Podaci o karti</h2>
        <table>
            <tr>
                <td>Klub domacin</td>
                <td>${domacin}</td>
            </tr>
            <tr>
                <td>Klub gost: </td>
                <td>${gost}</td>
            </tr>
            <tr>
                <td>Vreme utakmice: </td>
                <td>${vreme_utakmice}</td>
            </tr>
            <tr>
                <td>Cena karte </td>
                <td>${cena_karte}</td>
            </tr>
            <tr>
                <td>Sektor: </td>
                <td>${sektor}</td>
            </tr>
            <tr>
                <td>Broj sedista: </td>
                <td>${broj_sedista}</td>
            </tr>
        </table>
    </body>
</html>
<%@ include file="footer.jsp" %>