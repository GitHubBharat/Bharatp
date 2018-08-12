<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<pre><h1 style="color: navy;text-align: center;">Naukari Register now Parsonal Info</h1></pre>

<form:form method="POST" commandName="jobCmd" style="color: navy;text-align: center;">
<b>
Name :<form:input path="name"/><br>
Email :<form:input path="email"/><br>
Password :<form:input path="passwod"/><br>
Mobile :<form:input path="mobile"/><br>
<input type="submit" name="_target1" value="Next">
<input type="submit" name="_cancel" value="cancel">
</b>
</form:form>