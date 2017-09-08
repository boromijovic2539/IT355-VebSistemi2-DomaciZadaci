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
    <h1>Korisnici:</h1>

    <div class="responsive">
        <c:if test="${!empty korisnici}">
            <table>
                <thead>
                    <tr>
                        <th class="sorting">Id</th>
                        <th class="sorting">Ime</th>
                        <th class="sorting">Prezime</th>
                        <th class="sorting">Adresa</th>
                        <th class="sorting">Telefon</th>
                        <th class="sorting">Email</th>
                        <th class="sorting">Grad</th>
                        <th class="sorting">Drzava</th>
                        <th class="sorting">Obrisati</th>
                        <th class="sorting">Izmeniti</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${korisnici}" var="korisnik">
                        <tr modelAttribute="korisnikUp">
                            <td path="id_korisnik">${korisnik.id_korisnik}</td>
                            <td id="ime_korisnik">${korisnik.ime_korisnik}</td>
                            <td id="prezime_korisnik"${korisnik.prezime_korisnik}</td>
                            <td id="adresa_korisnik">${korisnik.adresa_korisnik}</td>
                            <td id="telefon_korisnik">${korisnik.telefon_korisnik}</td>
                            <td id="email_korisnik">${korisnik.email_korisnik}</td>
                            <td id="grad_korisnik">${korisnik.grad_korisnik}</td>
                            <td id="drzava_korisnik">${korisnik.drzava_korisnik}</td>
                            <td> <a href="<c:url value='/deleteKorisnik/${korisnik.id_korisnik}' />">Obrisi</a>
                            </td>
                            <td> <a href="<c:url value='/updateKorisnik/${korisnik.id_korisnik}' />">Izmeni</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
