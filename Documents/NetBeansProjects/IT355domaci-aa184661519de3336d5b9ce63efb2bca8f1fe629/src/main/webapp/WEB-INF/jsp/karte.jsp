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
        <h1>Karte:</h1>
        </br>
    </div>
    <c:if test="${!empty karte}">
        <table class="table table-striped" style="background-color: gray;">
            <thead>
                <tr>
                    <th width="50">id</th>

                    <th width="150">vreme</th>

                    <th width="100">gost</th>

                    <th width="100">cena</th>

                    <th width="100">Kupi</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items="${karte}" var="karta">
                    <tr>
                        <td>${karta.id_karta}</td>
                        <td>${karta.vreme_utakmice}</td>
                        <td>${karta.gostujuci_tim}</td>
                        <td>${karta.cena_karte}</td>
                        <td> <a href="<c:url value='/kupiKartu/${karta.id_karta}' />">Kupi</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
    <%@include file="footer.jsp" %>
