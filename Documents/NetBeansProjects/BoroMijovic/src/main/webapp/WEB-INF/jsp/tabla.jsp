<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css"/>
        <script src="https://code.jquery.com/jquery-3.1.1.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="<c:url value="/resources/table.js" />"></script>
        <link href="<c:url value="/resources/table.css" />" rel="stylesheet"  type="text/css" />
        <title>Prikaz podataka</title>
    </head>
    <h1>Karte:</h1>

    <div class="responsive">
        <c:if test="${!empty karte}">
            <table>
                <thead>
                    <tr>
                        <th class="sorting">Id</th>
                        <th class="sorting">Domacin</th>
                        <th class="sorting">Gost</th>
                        <th class="sorting">Vreme utakmice</th>
                        <th class="sorting">Cena</th>
                        <th class="sorting">Sektor</th>
                        <th class="sorting">Broj sedista</th>
                        <th class="sorting">Obrisati</th>
                        <th class="sorting">Izmeniti</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${karte}" var="karta">
                        <tr modelAttribute="kartaUp">
                            <td path="id_karta">${karta.id_karta}</td>
                            <td id="domacin">${karta.domacin}</td>
                            <td id="gost"${karta.gost}</td>
                            <td id="vreme_utakmice">${karta.vreme_utakmice}</td>
                            <td id="cena_karte">${karta.cena_karte}</td>
                            <td id="sektor">${karta.sektor}</td>
                            <td id="broj_sedista">${karta.broj_sedista}</td>
                            <td> <a href="<c:url value='/deleteKarta/${karta.id_karta}' />">Obrisi</a>
                            </td>
                            <td> <a href="<c:url value='/updateKarta/${karta.id_karta}' />">Izmeni</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>