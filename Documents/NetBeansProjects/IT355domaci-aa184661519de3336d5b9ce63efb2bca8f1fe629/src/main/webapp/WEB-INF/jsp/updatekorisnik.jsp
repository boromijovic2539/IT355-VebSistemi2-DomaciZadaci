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
        <form:form method="POST" modelAttribute="korisnik">
            <div style="float:left;">
                <form:label path="id_korisnik">ID</form:label>
                <form:input  id="id_korisnik"  path="id_korisnik" readonly="true"/>
            </div>
            <div style="float:left;">
                <form:label path="ime_korisnik">Ime</form:label>
                <form:input  id="ime_korisnik"  path="ime_korisnik" />
            </div>
            <div style="float:left;">
                <form:label path="prezime_korisnik">Prezime</form:label>
                <form:input id="prezime_korisnik"  path="prezime_korisnik" />
            </div>
            <div style="float:left;">
                <form:label path="adresa_korisnik">Adresa</form:label>
                <form:input id="adresa_korisnik" path="adresa_korisnik" />
            </div>
            <div style="float:left;">
                <form:label path="telefon_korisnik">Telefon</form:label>
                <form:input id="telefon_korisnik" path="telefon_korisnik" />
            </div>
            <div style="float:left;">
                <form:label path="email_korisnik">Email</form:label>
                <form:input id="email_korisnik" path="email_korisnik" />
            </div>
            <div style="float:left;">
                <form:label path="grad_korisnik">Grad</form:label>
                <form:input id="grad_korisnik" path="grad_korisnik" />
            </div>
            <div style="float:left;">
                <form:label path="drzava_korisnik">Drzava</form:label>
                <form:input id="drzava_korisnik" path="drzava_korisnik" />
            </div>       
            <div style="float:left;">
                <button type="submit">Dodaj</button>
            </div>
        </form:form>
    </body>
</html>
