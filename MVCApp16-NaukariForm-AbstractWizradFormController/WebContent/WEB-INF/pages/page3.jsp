<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<pre><h1 style="color: navy;text-align: center;">Naukari Register now Exp Info</h1></pre>

<form:form method="POST" commandName="jobCmd" style="color: navy;text-align: center;">
<b>
Exp :<form:input path="exp"/><br>
Expected CTC :<form:input path="expactedctc"/><br>
<input type="submit" name="_target1" value="Previous">
<input type="submit" name="_finish" value="Register">
<input type="submit" name="_cancel" value="cancel">
</b>
</form:form>
