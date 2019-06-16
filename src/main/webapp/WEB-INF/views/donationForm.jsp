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
<div class="contact">
    <div class="slogan container container--90">
        <div class="slogan--item">
            <h1>
                Zacznij pomagać!<br/>
                Wypełnij formularz.
            </h1>
            <form class="form--contact">
                <%--<form:form method="post">--%>
                <table>
                    <tr>
                        <td>Choose category:


                    <c:forEach items="${categories}" var="cat" varStatus="status">

                                <form:checkbox path="categories" value="${cat}"/>
                                <c:out value="${cat.name}"/>

                    </c:forEach>

                    <%--<td>--%>
                    <%--<form:checkboxes path="categories" items="${categories}"/>--%>
                    </td>
                    </tr>
                    <tr>
                        <td>Choose institution:
                            <form:select path="institutions">
                                <form:option value="NONE"> --SELECT--</form:option>
                                <c:forEach items="${institutions}" var="inst">
                                    <form:option value="${inst.name}"></form:option>
                                </c:forEach>
                            </form:select>
                        </td>
                    </tr>
                    <br>
                    <tr>
                        <td>Choose zipCode:
                            <form:input path="donation.zipCode" placeholder="Kod pocztowy"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Choose street:
                            <form:input path="donation.street" placeholder="Ulica"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Choose city:
                            <form:input path="donation.city" placeholder="Miasto"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Choose quantity:
                            <form:input path="donation.quantity" placeholder="Liczba workow"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Choose pickUpComment:
                            <form:textarea path="donation.pickUpComment" placeholder="Komentarz"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Choose pickUpDate:
                            <form:input type="date" path="donation.pickUpDate"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Choose pickUpTime:
                            <form:input type="time" path="donation.pickUpTime"/>
                        </td>
                    </tr>
                </table>
            </form>
            <%--</form:form>--%>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>