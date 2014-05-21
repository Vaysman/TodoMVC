<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">

<body>
    <c:url value="/resources/text.txt" var="url"/>
    <spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl"/>
    Spring URL: ${springUrl} at ${time}
    <br>
    JSTL URL: ${url}
    <br>
    Message: ${message}

    <div>
        <ul>
            <c:forEach items="${tasks}" var="task">
                <li>${task.title}, <strong>${task.id}</strong></li>
            </c:forEach>
        </ul>
    </div>
</body>

</html>