<%@ page language="java" contentType="text/html;
         charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;
              charset=ISO-8859-1">
        <title>Potvrda porudzbine</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>

        <link href="<c:url value='/static/app.css' />"
              rel="stylesheet"></link>
    </head>
    <body>
        <div class="generic-container">
            <div class="alert alert-success lead">
                ${success}
            </div>
            <span class="well floatRight">
                <a href="<c:url value='/newPecivo' />">Nastavi kupovinu</a>
            </span>
            <span class="well floatRight">
                <a href="<c:url value='/checkStatus' />">Proveri status   porudzbine</a>
            </span>
        </div>
    </body>
</html>