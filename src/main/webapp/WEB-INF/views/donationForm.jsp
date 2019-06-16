<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Document</title>

    <link rel="stylesheet" href="<c:url value="resources/css/style.css"/>"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<%--<form:form>--%>
<table>
    <tr>
        <td>Choose category:</td>
        <br>
        <td>
            <form:checkboxes path="categories" items="${categories}"/>
        </td>
    </tr>
    <tr>
        <td>Choose institution:</td>
        <br>
        <td>
            <form:select  path="institutions">
                <form:option value="NONE"> --SELECT--</form:option>
                <form:options items="${institutions}"></form:options>
            </form:select>
        </td>
    </tr>
    <tr>
        <td>Choose zipCode:</td>
        <td>
        <form:input path="donation.zipCode"/>
        </td>
    </tr>
    <tr>
        <td>Choose street:</td>
        <td>
        <form:input path="donation.street" />
        </td>
    </tr>
    <tr>
        <td>Choose city:</td>
        <td>
        <form:input path="donation.city"/>
        </td>
    </tr>
    <tr>
        <td>Choose quantity:</td>
        <td>
        <form:input path="donation.quantity"/>
        </td>
    </tr>
    <tr>
        <td>Choose pickUpComment:</td>
        <td>
        <form:textarea path="donation.pickUpComment"/>
        </td>
    </tr>
    <tr>
        <td>Choose pickUpDate:</td>
        <td>
        <form:input type="date" path="donation.pickUpDate"/>
        </td>
    </tr>
    <tr>
        <td>Choose pickUpTime:</td>
        <td>
        <form:input type="time" path="donation.pickUpTime" />
        </td>
    </tr>
</table>
<%--</form:form>--%>
<jsp:include page="footer.jsp"/>
</body>
</html>