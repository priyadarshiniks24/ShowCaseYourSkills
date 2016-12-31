<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	$(document).ready(function() {
		document.f.username.focus();
	});
</script>

<h3>Login with Username and Password</h3>

<c:if test="${param.error != null}">
	<span class="loginerror">Invalid User ID or Password!</span>
</c:if>

<form name='f' action='${pageContext.request.contextPath}/login'
	method='POST'>
	<table>
		<tr>
			<td class="label">User:</td>
			<td><input type='text' name='username' value=''></td>
		</tr>
		<tr>
			<td class="label">Password:</td>
			<td><input type='password' name='password' /></td>
		</tr>
		<tr>
			<td></td>
			<td colspan='2'><input name="submit" type="submit" value="Login" /></td>
		</tr>
		<input name="${_csrf.parameterName}" type="hidden"
			value="${_csrf.token}" />
	</table>
</form>
<p>
	<a href='<c:url value="/newaccount"/>'>Create new account</a>
<p>