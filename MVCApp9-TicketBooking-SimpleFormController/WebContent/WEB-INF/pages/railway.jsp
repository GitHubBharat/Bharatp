<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color: lime; text-align: center;">Railway Ticket Generate Page</h1>
<form:form method="POST" commandName="RailCmd">
<pre>Pname :: <form:input path="pname"/><br>
from :: <form:input path="from"/><br>
To :: <form:input path="to"/><br>
Date  :: <form:input path="jounaryStart"/><br>
Fare<form:input path="fare"/><br></pre>
<input type="submit" value="Get Ticket">
</form:form>