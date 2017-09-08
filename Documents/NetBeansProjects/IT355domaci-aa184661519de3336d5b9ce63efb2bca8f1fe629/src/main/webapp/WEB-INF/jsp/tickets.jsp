<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true"%>
<head>
    <title>Tickets</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css"/>
    <script src="https://code.jquery.com/jquery-3.1.1.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="<c:url value="/resources/slider.js" />"></script>
    <link href="<c:url value="/resources/slider.css" />" rel="stylesheet"  type="text/css" />
</head>
<body onload='plusDivs(1)'>
<%@include file="header.jsp" %>
<div class="w3-container" style = "color:white; display: block; margin: auto;" >
    </br>
    <div class="w3-content w3-display-container" style="max-width:800px" >
        <img class="mySlides" src="<c:url value='/resources/ticket.jpg'/>" style="width:100%" >
        <img class="mySlides" src="<c:url value='/resources/ticket2.jpg'/>" style="width:100%">
        <img class="mySlides" src="<c:url value='/resources/ticket3.jpg'/>" style="width:100%">
        <div class="w3-center w3-container w3-section w3-large w3-text-white w3-display-bottommiddle" style="width:100%">
            <div class="w3-left w3-hover-text-khaki" onclick="plusDivs(-1)">&#10094;</div>
            <div class="w3-right w3-hover-text-khaki" onclick="plusDivs(1)">&#10095;</div>
            <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(1)"></span>
            <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(2)"></span>
            <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(3)"></span>
        </div>

    </div>
    </br>
    <button style=" display: block; margin: auto;">ORDER</button>
</div>
</body>
<%@include file="footer.jsp" %>