<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${app} | ${pageTitle}</title>
<jsp:include page="/styles/bootstrap.jsp"></jsp:include>
</head>
<body class="d-flex justify-content-center">
	<div class="mt-4 border w-75 p-3">
		<div class="d-flex justify-content-between">
			<div class="h3">My To-Do List</div>
		</div>

		<div class="container-fluid mt-4">
			<div class="row">
				<div class="col-3">
					<jsp:include page="/component/menu.jsp"></jsp:include>
				</div>
				
				<div class="col">
					<jsp:include page="/page/${page}"></jsp:include>
				</div>
			</div>
		</div>
	</div>
</body>
</html>