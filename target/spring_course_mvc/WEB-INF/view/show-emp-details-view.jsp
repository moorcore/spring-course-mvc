<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>
    You're welcome!
</h2>

<br><br><br>

Name: ${employee.name}
<br><br>
Surname: ${employee.surName}
<br><br>
Salary: ${employee.salary}
<br><br>
Department: ${employee.department}
<br><br>
Car: ${employee.carBrand}
<br><br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>


</body>

</html>