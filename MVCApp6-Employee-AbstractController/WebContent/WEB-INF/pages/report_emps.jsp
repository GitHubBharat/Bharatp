<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="text-align: center; color: purple; border-color: lime;">
	<pre>Employee Table</pre>
</h1>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${!empty emplist}">
	<table border="1">
		<c:forEach var="dto" items="${emplist }">
			<tr>
				<td>${dto.empno}</td>
				<td>${dto.eName}</td>
				<td>${dto.degs}</td>
				<td>${dto.sal}</td>
			</tr>
		</c:forEach>
	</table>
	</c:when>
	<c:otherwise>
	<h1>No data found</h1>
	</c:otherwise>
</c:choose>