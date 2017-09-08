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
    <h1>Zaposleni:</h1>

    <div class="responsive">
        <c:if test="${!empty zaposleni}">
            <table>
                <thead>
                    <tr>
                        <th class="sorting">Id</th>
                        <th class="sorting">Ime</th>
                        <th class="sorting">Prezime</th>
                        <th class="sorting">Adresa</th>
                        <th class="sorting">Telefon</th>
                        <th class="sorting">Zanimanje</th>
                        <th class="sorting">Obrisati</th>
                        <th class="sorting">Izmeniti</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${zaposleni}" var="zaposlen">
                        <tr>
                            <td path="id">${zaposlen.id_zaposleni}</td>
                            <td id="ime_korisnik">${zaposlen.ime_zaposleni}</td>
                            <td id="prezime_korisnik">${zaposlen.prezime_zaposleni}</td>
                            <td id="adresa_korisnik">${zaposlen.adresa_zaposleni}</td>
                            <td id="telefon_korisnik">${zaposlen.telefon_zaposleni}</td>
                            <td id="zanimanje">${zaposlen.zanimanje}</td>
                            <td>
                                <a href="<c:url value='/deleteZaposleni/${zaposlen.id_zaposleni}' />">Obrisi</a>                     </td>
                            <td> <a href="<c:url value='/updateZaposleni/${zaposlen.id_zaposleni}' />">Izmeni</a>
                            </td>
                        </tr>
                    </c:forEach>
                </c:if>
            </tbody>
        </table>
    </div>
