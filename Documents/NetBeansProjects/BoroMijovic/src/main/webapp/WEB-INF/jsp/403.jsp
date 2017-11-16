<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp" %>
<html>
    <body>
        
        <div style=" margin: auto; width: 50%;">
            <img src="http://flarrio.com/wp-content/uploads/2016/05/403-Forbidden-Error.png" alt="FORBIDDEN ACCESS" />
        </div>
        <h1>You are not allowed to see this page</h1>
        <c:choose>
            <c:when test="${empty username}">
                <h2>Login</h2>
            </c:when>
            <c:otherwise>
                <h2>User ${username} <br/> you aren't allowed here!</h2>
                </c:otherwise>
            </c:choose>
    </body>
</html>
<%@ include file="footer.jsp" %>