<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<a class="title" href="${pageContext.request.contextPath}/">ShowCaseYourSkills</a>

<sec:authorize access="isAuthenticated()">
	<c:url var="logoutUrl" value="/logout" />
	<form action="${logoutUrl}" method="post">
		<input class="login" type="submit" value="Log out" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</sec:authorize>

<sec:authorize access="!isAuthenticated()">
	<p>
		<a class="login" href="${pageContext.request.contextPath}/login">Login</a>
	</p>
</sec:authorize>