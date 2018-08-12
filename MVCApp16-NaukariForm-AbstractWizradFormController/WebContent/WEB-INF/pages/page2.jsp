<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<pre><h1 style="color: navy;text-align: center;">Naukari Register now Educational Info</h1></pre>

<form:form method="POST" commandName="jobCmd" style="color: navy;text-align: center;">
<b>
Qualification :<form:input path="quly"/><br>
Skills :<form:input path="skills"/><br>
CTC :<form:input path="ctc"/><br>
<input type="submit" name="_target0" value="Privious">
<input type="submit" name="_target2" value="Next">
<input type="submit" name="_cancel" value="cancel">
</b>
</form:form>
