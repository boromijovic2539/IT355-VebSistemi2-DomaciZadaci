<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="true"%>
<head>
    <title>Login Page</title>
    <link href="<c:url value="/resources/headerLogin.css" />" rel="stylesheet"  type="text/css" />
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<%@include file="header.jsp" %>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-offset-5 col-md-3">
                <form name='registerForm' class="form-login" action="<c:url value='/j_spring_security_check' />" method='POST'>
                    <h4>Let's register</h4>
                    
                    <input type="text" name='ime_korisnik' class="form-control input-sm chat-input" placeholder="Ime" />
                    </br>
                    
                    <input type='text' name='prezime_korisnik' class="form-control input-sm chat-input" placeholder="Prezime" />
                    </br>
                      
                    <input type="text" name='email_korisnik' class="form-control input-sm chat-input" placeholder="Email" />
                    </br>
                    
                    <input type='text' name='telefon_korisnik' class="form-control input-sm chat-input" placeholder="Telefon" />
                    </br>
                      
                    <input type="text" name='grad_korisnik' class="form-control input-sm chat-input" placeholder="Grad" />
                    </br>
                    
                    <input type="text" name='drzava_korisnik' class="form-control input-sm chat-input" placeholder="Drzava" />
                    </br>
                    
                    <input type="text" name='username' class="form-control input-sm chat-input" placeholder="username" />
                    </br>
                    
                    <input type='password' name='password' class="form-control input-sm chat-input" placeholder="password" />
                    </br>
                    
                    
                    
                    <div class="wrapper">
                        <span class="group-btn"> 
                            <button class="btn btn-primary btn-md" name="submit" type="submit" value="register" >Register <i class='fa fa-sign-in'></i></button>
                        </span>
                    </div>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

                </form>

            </div>
        </div>
<%@include file="footer.jsp" %>