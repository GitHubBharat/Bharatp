<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color: navy; text-align: center;"> Student Registration Page</h1>
<script type="text/javascript" language="JavaScript" src="validation.js">
</script>
<form:form method="POST" commandName="stCmd">
     <b>Name</b><form:input path="name" placeholder="bharat" /><br>
     <b>Address</b><form:input path="address" placeholder="bhopal" /><br>
     <b>Gender</b><form:checkboxe path="gender" items="male"/><form:checkboxe path="gender" items="female"/><br>
       <b>Course</b><form:select path="courses" multiple="true">
       <form:option value="${courses }"/></form:select><br>
       <b>Hobbies</b><form:select path="hobbies" multiple="true">
       <form:option value="${hobbies }"/></form:select>
       
</form:form>