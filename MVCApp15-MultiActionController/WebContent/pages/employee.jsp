<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color: navy;text-align: center;">Employee Register</h1>

<form:form method="POST" commandName="empCmd"  >
<p  style="color: navy;text-align: center;"><form:errors path="*"/></p>
<b>eno</b><form:input path="eno"/><br>
<b>ename</b><form:input path="ename"/><br>
<b>DOB</b><form:input path="dob"/>(DD-MM-YYYY)<br>
<b>doj</b><form:input path="doj"/>(DD-MM-YYYY)<br>
<b>dom</b><form:input path="dom"/>(DD-MM-YYYY)<br> 
<input  style="color: navy;text-align: center;" type="submit" value="register">
</form:form>