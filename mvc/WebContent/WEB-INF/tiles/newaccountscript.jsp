<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script type="text/javascript">
	function onload() {

		$("#password").keyup(checkPasswordsMatch);
		$("#confirmpass").keyup(checkPasswordsMatch);

		$("#createAccountForm").submit(canSubmit);
	}

	function canSubmit() {
		var password = $("#password").val();
		var confirmPass = $("#confirmpass").val();

		if (password != confirmPass) {
			return false;
			alert("Passwords do not match");
		}

		else
			return true;
	}

	function checkPasswordsMatch() {
		var password = $("#password").val();
		var confirmPass = $("#confirmpass").val();

		if (password.length > 3 || confirmPass.length > 3) {
			if (password == confirmPass) {
				$("#passwordsMatch")
						.text(
								"<fmt:message key = 'MatchedPasswords.user.password'></fmt:message>");
				$("#passwordsMatch").addClass("valid");
				$("#passwordsMatch").removeClass("error");
			} else {
				$("#passwordsMatch")
						.text(
								"<fmt:message key = 'UnmatchedPasswords.user.password'></fmt:message>");
				$("#passwordsMatch").addClass("error");
				$("#passwordsMatch").removeClass("valid");
			}
		}
	}

	$(document).ready(onload);
</script>