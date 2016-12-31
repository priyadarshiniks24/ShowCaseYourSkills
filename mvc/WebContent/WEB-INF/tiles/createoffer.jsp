<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<sf:form method="post"
	action="${pageContext.request.contextPath}/doCreate"
	commandName="offer">
	<table>
		<tr>
			<td>Name:</td>
			<td><sf:input name="name" type="text" path="name" /><br /> <sf:errors
					cssClass="error" path="name"></sf:errors></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><sf:input name="email" type="text" path="email" /><br /> <sf:errors
					cssClass="error" path="email"></sf:errors></td>
		</tr>
		<tr>
			<td>Speciality:</td>
			<td><sf:textarea name="text" rows="10" cols="16" path="text"></sf:textarea><br />
				<sf:errors cssClass="error" path="text"></sf:errors></td>
		</tr>
		<tr>
			<td></td>
			<td><input value="Submit" type="submit" /></td>
		</tr>
	</table>
</sf:form>
