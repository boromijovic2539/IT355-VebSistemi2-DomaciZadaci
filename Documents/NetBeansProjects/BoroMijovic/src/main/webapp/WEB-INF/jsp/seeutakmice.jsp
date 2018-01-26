<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="headerH.jsp" %>
<h1>Product list</h1>
<c:if test="${!empty utakmice}">

    <table class="table table-striped">
        <thead>
            <tr>
                <th>Vreme utakmice</th>
                <th>Gostujuci tim</th>
                <th>Klub</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody> 
            <c:forEach items="${utakmice}" var="utakmica">

                <tr>
                    <td>${utakmica.vreme_utakmice}</td>
                    <td>${utakmica.gostujuci_tim}</td>
                    <td>${utakmica.klub}</td>
                    <td><a href="<c:url value='/editUtakmica/${utakmica.id_utakmica}' />">edit</a></td>
                    <td><a href="<c:url value='/deleteutakmica/${utakmica.id_utakmica}' />">delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>
<%@include file="footerH.jsp" %>