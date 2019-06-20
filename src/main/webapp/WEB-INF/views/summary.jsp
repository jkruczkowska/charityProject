<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>
<jsp:include page="header.jsp"/>
<h3>Podsumowanie Twojej darowizny</h3>
<div class="form--steps-container">
<div class="summary">
    <div class="form-section">
        <h4>Oddajesz:</h4>
        <ul>
            <li>
                <span class="icon icon-bag"></span>
                <span class="summary--text"
                >4 worki ubrań w dobrym stanie dla dzieci</span
                >
            </li>

            <li>
                <span class="icon icon-hand"></span>
                <span class="summary--text"
                >Dla fundacji "Mam marzenie" w Warszawie</span
                >
            </li>
        </ul>
    </div>

    <div class="form-section form-section--columns">
        <div class="form-section--column">
            <h4>Adres odbioru:</h4>
            <ul>
                <li>Prosta 51</li>
                <li>Warszawa</li>
                <li>99-098</li>
                <li>123 456 789</li>
            </ul>
        </div>

        <div class="form-section--column">
            <h4>Termin odbioru:</h4>
            <ul>
                <li>13/12/2018</li>
                <li>15:40</li>
                <li>Brak uwag</li>
            </ul>
        </div>
    </div>
</div>
</div>
<div class="form-group form-group--buttons">
    <button type="button" class="btn prev-step">Wstecz</button>
    <button type="submit" class="btn">Potwierdzam</button>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
