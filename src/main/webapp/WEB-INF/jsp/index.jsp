<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">

<body>
<spring:url value="/tasks" var="showTask" />
<h1>Tasks list</h1>
<div>
    <ul>
        <c:forEach items="${tasks}" var="task">
            <li>
                <a href="${showTask}/${task.id}">${task.title}</a>
            </li>
        </c:forEach>
    </ul>
</div>
</body>

</html>
