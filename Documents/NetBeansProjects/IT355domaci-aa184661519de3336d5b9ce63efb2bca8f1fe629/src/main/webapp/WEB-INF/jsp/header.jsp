<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="http://www.futhead.com/static//img/14/clubs/1887.png"/>
        <script src="<c:url value="/resources/stylequery.js" />"></script>
        <link href="<c:url value="/resources/headerStyle.css" />" rel="stylesheet"  type="text/css" />
        <link href="<c:url value="/resources/style.css" />" rel="stylesheet"  type="text/css" />
        <link href="<c:url value="/resources/backgroundStyle.css" />" rel="stylesheet"  type="text/css" />
    </head>

    <title class="sansserif" >Vitoria F.A.M</title>

    <body>
        <div class = "header">
            <div class="header-banner">
                <a href="#" class="logo"><img src="http://www.futhead.com/static//img/14/clubs/1887.png" style="width: auto; height: auto;max-width: 100px;max-height: 100px"></a>

                <h1>Vitoria F.A.M</h1>
                <div class="userAut">
                    <sec:authorize access="hasRole('ROLE_USER')">
                        <c:url value="/j_spring_security_logout" var="logoutUrl" />
                        <form action="${logoutUrl}" method="post" id="logoutForm">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                        </form>
                        <script>
                            function formSubmit() {
                                document.getElementById("logoutForm").submit();
                            }
                        </script>
                        <c:if test="${pageContext.request.userPrincipal.name != null}">
                            <p style="color: white;"> Vase korisnicko ime je :
                                ${pageContext.request.userPrincipal.name} | <a href="javascript:formSubmit()">Logout</a>

                            </c:if>
                    </sec:authorize>
                </div>
            </div>
            <nav>
                <ul>
                    <li><a class="active" href="/PrviDomaci">Home</a></li>
                    <li><a href="istorija">History</a></li> 
                    <li><a href="igraci">Players</a></li>
                    <li><a href="zaposleni">Menagment</a></li>
                    <li><a href="karte">Tickets</a></li>
                    <li><a href="kontakt">Contact</a></li>
                    <li><a href="login">Login</a></li>
                    <li><a href="register">Register</a></li>
                </ul>
            </nav> 
        </div>
        <div class="content">
            </br>
