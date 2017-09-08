<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="true"%>
<head>
    <title>Contact</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css"/>
    <link href="<c:url value="/resources/email.css" />" rel="stylesheet"  type="text/css" />
</head>
<%@include file="header.jsp" %> 
<div class="container" style="float: left; height: 40%; margin-left: 30px;">
    <div class="row-fluid">
        <div class="span8" style="float: left;">
            <iframe width="500" height="350" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6342.319004338453!2d-16.923637939353913!3d32.6401084654923!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xc605ffc17d79b1d%3A0x54d8c019af195f30!2sFunchal!5e0!3m2!1sen!2srs!4v1504826943777"></iframe>
        </div>
        <div class="span4" style="float: left; height: 100%;  margin-left: 30px; background-color: gray; color: white;">
            <h2>Kontakt</h2>
            <address>
                <strong>Vitoria F.A.M</strong><br>
                Via Portogesso<br>
                Madera<br>
                Portugal<br>
                CT21 5SH<br>
                <abbr title="Phone">P:</abbr> 01234 567 890
            </address>
        </div>
    </div>
</div>





<%@include file="footer.jsp" %>