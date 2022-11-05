<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please enter your details</h2>
<br>
<br>
<br>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your carbrand: ${employee.carBrand}
<br>
Language(s):
<u1>

    <c:forEach var="lang" items="${employee.languages}">

        <li>   ${lang}      </li>

    </c:forEach>

</u1>
<br>
Your phonenumber:${employee.phoneNumber}

</body>

</html>
