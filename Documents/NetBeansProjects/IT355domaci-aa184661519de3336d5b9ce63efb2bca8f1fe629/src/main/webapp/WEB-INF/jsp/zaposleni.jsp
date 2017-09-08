<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>



    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
        <script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"/>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/flatly/bootstrap.min.css"/>

        <script>
            $(document).ready(function () {
                $("table").DataTable();
            });
        </script>
        <title>Prikaz podataka</title>
    </head>

    <%@include file="header.jsp" %>
    <div style="color:white; background-color: black; width: 100%">
        </br>
        <h1>Zaposleni:</h1>
        </br>
    </div>
    <c:if test="${!empty zaposleni}">
        <table class="table table-striped" style="background-color: gray;">
            <thead>
                <tr>
                    <th width="50">id</th>

                    <th width="150">ime</th>

                    <th width="100">prezime</th>

                    <th width="100">adresa</th>

                    <th width="100">telefon</th>

                    <th width="100">zanimanje</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${zaposleni}" var="zaposlen">
                    <tr>
                        <td>${zaposlen.id_zaposleni}</td>
                        <td>${zaposlen.ime_zaposleni}</td>
                        <td>${zaposlen.prezime_zaposleni}</td>
                        <td>${zaposlen.adresa_zaposleni}</td>
                        <td>${zaposlen.telefon_zaposleni}</td>
                        <td>${zaposlen.zanimanje}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
    <%@include file="footer.jsp" %>
