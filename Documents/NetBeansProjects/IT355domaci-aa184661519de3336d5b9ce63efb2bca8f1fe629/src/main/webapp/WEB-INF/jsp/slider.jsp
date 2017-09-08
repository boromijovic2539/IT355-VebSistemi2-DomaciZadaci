<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Registration Page</title>
    </head>
    <%@include file="header.jsp" %>


        <form name='registrationForm' action="<c:url value='/j_spring_security_check' />" method='POST'>
            <table style="color: white;">
                <tr>
                    <td><input placeholder="Name" type='text' name='name' ></td>
                </tr>
                <tr>
                    <td><input placeholder="Surname" type='text' name='surname'></td>
                </tr>
                <tr>
                    <td><input placeholder="Email" type='text' name='email'></td>
                </tr>
                <tr>
                    <td><input placeholder="Username" type='text' name='usernmae'></td>
                </tr>
                <tr>
                    <td><input placeholder="Password" type='password' name='password'/></td>
                </tr>
                <tr>
                    <td><input placeholder="Confirm Password" type='password' name='repassword'/></td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
                </tr>
            </table>
        </form>
    <%@include file="footer.jsp" %>