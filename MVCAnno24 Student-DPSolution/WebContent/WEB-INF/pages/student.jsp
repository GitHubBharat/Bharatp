<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color: navy;; text-align: center;">Student Registration Page</h1>
<script type="text/javascript" language="JavaScript" src="validation.js">
	
</script>
<form:form method="POST" modelAttribute="stdCmd" >
	<pre>
		<font color="red">
<form:errors path="*" />
		</font>

Sno :: <form:input path="sno" placeholder="121" />
		<span id="snoErr"></span><br>
Sname :: <form:input path="sname" placeholder="raaz" />
		<span id="snameErr"></span><br>
Address :: <form:input path="address" placeholder="bhopal" />
		<span id="addressErr"></span><br>
Course :: <form:input path="course" placeholder="java" />
		<span id="courseErr"></span><br>
Avg :: <form:input path="avg" placeholder="0-100" />
		<span id="avgErr"></span><br>
	</pre>
	<form:hidden path="vflag" />
	<input type="submit" value="Register">
	<input type="hidden" name="cToken" value="${sToken }">
</form:form>

<style>
span {
	color: navy;
	font-size: 10px;
	
}
</style>



<hr>
${resMsg}