<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title> Rock-Paper-Scissors </title>
    </head>
    <body>
        <form:form action="turn" method="post">
            <input type="radio" value="Rock" id="tryIndex"  name="tryIndex">Rock</input>
            <input type="radio" value="Paper" id="tryIndex" name="tryIndex">Paper</input>
            <input type="radio" value="Scissors" id="tryIndex" name="tryIndex">Scissors</input>

            <input type="submit" value="Play!"/>
        </form:form>
    </body>
</html>