<%@ page language="java" contentType="text/html;
         charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;
              charset=ISO-8859-1">
        <title>Narucivanje</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
        <link href="<c:url value='/static/app.css' />"
              rel="stylesheet"></link>
    </head>
    <body>
        <div class="generic-container">
            <div class="well lead">Narucite:</div>
            <form:form method="POST" modelAttribute="pecivo"
                       class="form-horizontal">
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable"
                               for="naziv">Naziv proizvoda:</label>
                        <div class="col-md-7">
                            <form:input type="text" path="naziv"
                                        id="naziv" class="form-control input-sm"
                                        required="required"/>
                            <div class="has-error">
                                <form:errors path="naziv"
                                             class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-lable"
                               for="kolicina">Kolicina:</label>
                        <div class="col-md-7">
                            <form:input type="text" path="kolicina"
                                        id="kolicina" class="form-control input-sm" required="required"/>
                            <div class="has-error">
                                <form:errors path="kolicina"
                                             class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-actions floatRight">
                        <input type="submit" value="Place Order"
                               class="btn btn-primary btn-sm"/> ili <a href="<c:url
                                   value='/' />">ponisti narudzbinu</a>
                    </div>
                </div>
            </form:form>
        </div>
    </body>
</html>