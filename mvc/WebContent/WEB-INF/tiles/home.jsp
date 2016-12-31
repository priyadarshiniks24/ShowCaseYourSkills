<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<p><a href="${pageContext.request.contextPath}/offers">Show Current List of Skilled Candidates</a></p>
<p><a href="${pageContext.request.contextPath}/createoffer">Add Skill</a></p>

<sec:authorize access="hasRole('admin')"><c:url value="/admin" var="admin" />
<p><a href="${admin}">Admin</a></p></sec:authorize>
