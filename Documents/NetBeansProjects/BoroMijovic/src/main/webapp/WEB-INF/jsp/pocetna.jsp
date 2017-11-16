<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Početna stranica</title>
    </head>
    <body>
        <h1>Hello user!</h1>
        <h1> ${message}</h1>
        <sec:authorize access="hasRole('ROLE_USER')">
            <c:url value="/j_spring_security_logout" var="logoutUrl" />
            <form action="${logoutUrl}" method="post" id="logoutForm">
                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}" />
            </form>
            <script>
                function formSubmit() {
                    document.getElementById("logoutForm").submit();
                }
            </script>
            <c:if test="${pageContext.request.userPrincipal.name
                          != null}">
                  <h2>
                      Your username is :
                      ${pageContext.request.userPrincipal.name} | <a
                          href="javascript:formSubmit()">Logout</a>
                  </h2>
            </c:if>
        </sec:authorize>
        <div class="container">
            <h1>Hello World!</h1>
            </br>
            <h2>${poruka}</h2>
            </br>
            <p>Ovaj paragraf je obican</p>
            <p class="lead">Ovaj paragraf je bootstrap</p>
        </div>
    </body>
</html>