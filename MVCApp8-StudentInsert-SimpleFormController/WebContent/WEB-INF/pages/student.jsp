<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color: lime; text-align: center;">Student Registration Page</h1>
<script type="text/javascript" language="JavaScript" src="validation.js">
</script>
<form:form method="POST" commandName="stCmd" onsubmit="return validate(this)" style="color: lime; text-align: center;">
<pre><font color="red">
<form:errors path="*"/></font>

Sno :: <form:input path="sno"/><span id="snoErr"></span><br>
Sname :: <form:input path="sname"/><span id="snameErr"></span><br>
Address :: <form:input path="address"/><span id="addressErr"></span><br>
Course :: <form:input path="course"/><span id="courseErr"></span><br>
Avg :: <form:input path="avg"/><span id="avgErr"></span><br></pre>
<input type="submit" value="Register">
</form:form>