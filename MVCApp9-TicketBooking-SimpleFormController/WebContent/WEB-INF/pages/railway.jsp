<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color:lime;text-align: center; ">Railway Ticket </h1>
<form:form method="POST" commandName="railCmd" style="color:lime;text-align: center; ">
   <p style="color: red;"><form:errors path="*"/></p>
Pname ::<form:input path="pname"/><br>
source:: <form:input path="source"/><br>
dest:: <form:input path="dest"/><br>
jounaryStart:: <form:input path="jounaryStart"/><br>
fare <form:input path="fare"/><br>
<input type="submit" value="Generate">
</form:form>
 