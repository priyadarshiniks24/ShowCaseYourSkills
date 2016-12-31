<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<h3>Create New Account</h3>
<sf:form id="createAccountForm" method="post"
	action="${pageContext.request.contextPath}/createaccount"
	commandName="user">
	<table>
		<tr>
			<td class="label">Username:</td>
			<td><sf:input name="username" type="text" path="username" /><br />
				<div class="error">
					<sf:errors path="username"></sf:errors>
				</div></td>
		</tr>
		<tr>
			<td class="label">Email:</td>
			<td><sf:input name="email" type="text" path="email" /><br />
				<div class="error">
					<sf:errors path="email"></sf:errors>
				</div></td>
		</tr>
		<tr>
			<td class="label">Password:</td>
			<td><sf:input id="password" name="password" type="password"
					path="password" /><br />
				<div class="error">
					<sf:errors path="password"></sf:errors>
				</div></td>
		</tr>
		<tr>
			<td class="label">Confirm Password:</td>
			<td><input id="confirmpass" name="confirmpass" type="password" />
			<div id="passwordsMatch"></div></td>
		</tr>
		<tr>
			<td></td>
			<td><input value="Create Account" type="submit" /></td>
		</tr>
	</table>
</sf:form>
