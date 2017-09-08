<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page session="true"%>
<head>
    <title>Login Page</title>
    <link href="<c:url value="/resources/backgroundStyle.css" />" rel="stylesheet"  type="text/css" /> 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css"/>
    <script src="https://code.jquery.com/jquery-3.1.1.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css"/>
    <script src="https://code.jquery.com/jquery-3.1.1.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="<c:url value="/resources/headerLogin.css" />" rel="stylesheet"  type="text/css" />
</head>
<%@include file="header.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3">


            <form:form  name='registerForm' class="form-Login" modelAttribute="korisnik"   method='POST'>
                <h4>Welcome back.</h4>
                <form:input type="text" name='ime_korisnik' path='ime_korisnik' class="form-control input-sm chat-input" placeholder="ime" />
                </br>
                <form:input type='text' name='prezime_korisnik' path='prezime_korisnik' class="form-control input-sm chat-input" placeholder="prezime" />
                </br>
                <form:input type="text" name='email_korisnik' path='email_korisnik' class="form-control input-sm chat-input" placeholder="email" />
                </br>
                <form:input type="text" name='adresa_korisnik' path='adresa_korisnik' class="form-control input-sm chat-input" placeholder="adresa" />
                </br>
                <form:input type="text" name='telefon_korisnik' path='telefon_korisnik' class="form-control input-sm chat-input" placeholder="telefon" />
                </br>
                <form:input type='text' name='grad_korisnik' path='grad_korisnik' class="form-control input-sm chat-input" placeholder="grad" />
                </br>
                <form:input type="text" name='drzava_korisnik' path='drzava_korisnik' class="form-control input-sm chat-input" placeholder="drzava" />
                </br>
                <form:input type="text" name='username' path='username' class="form-control input-sm chat-input" placeholder="username" />
                </br>
                <form:input type='password' name='password' path='password'  class="form-control input-sm chat-input" placeholder="password" />
                </br>
                <div class="wrapper">
                    <span class="group-btn"> 
                        <button class="btn btn-primary btn-md" name="submit" type="submit" value="login" >Login <i class='fa fa-sign-in'></i></button>
                    </span>
                </div>
            </form:form >

        </div>
    </div>
</div>
<%@include file="footer.jsp" %>