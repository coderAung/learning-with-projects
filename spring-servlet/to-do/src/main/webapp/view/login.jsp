<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<jsp:include page="/styles/bootstrap.jsp"></jsp:include>
</head>
<body class="d-flex justify-content-center">
	<div class="mt-4 border w-50">
		<div class="mx-auto w-75 p-3">
			<h4 class="mb-3">Login</h4>
			
			<c:url var="login" value="/login"></c:url>
			<form action="${login}" method="post">
				<div class="mb-3">
					<input name="email" type="text" class="form-control" placeholder="Enter Email"/>
				</div>
				<div class="mb-3">
					<input name="password" type="password" class="form-control" placeholder="Enter Password"/>
				</div>
				<div>
					<button type="submit" class="btn btn-primary w-75">Login</button>
					<a href="#" class="d-block mt-3">Don't have an account? Sign up here</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>