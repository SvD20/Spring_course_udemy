<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please enter your details</h2>

<br>
<br>

<form:form action = "showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname<form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary<form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department<form:select path="department">
    <form:option value="Information technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>

    </form:select>
    <br><br>
    Which car do you want?
    BMW <form:radiobutton path="carBrand" value="BMW"/>
    Audi <form:radiobutton path="carBrand" value="Audi"/>
    MB <form:radiobutton path="carBrand" value="MB"/>
    <br><br>
    Foreign Language(s)
    EN<form:checkbox path="languages" value="English"></form:checkbox>
    DE<form:checkbox path="languages" value="Deutch"></form:checkbox>
    FR<form:checkbox path="languages" value="French"></form:checkbox>
    <br><br>
    Phonenumber <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>


</html>