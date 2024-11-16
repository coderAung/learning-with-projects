<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="mb-3">
	<jsp:include page="/component/search-form.jsp"></jsp:include>
</div>
<div>
	<h5 class="mb-3">To Day Task | 16 Nov, 2024</h5>
	<table class="table border">
		<thead></thead>
		<tbody>

			<c:forEach var="task" items="${tasks}">
				<tr class="align-middle">
					<td class="col-auto">${task.id}</td>
					<td class="col-auto">Check</td>
					<td class="col-9">${task.name}</td>
					<td class="col-auto">
						<button class="btn btn-sm btn-secondary">Description</button>
					</td>
					<td class="col-auto">
						<button class="btn btn-sm btn-warning">Edit</button>
					</td>
					<td class="col-auto">
						<button class="btn btn-sm btn-danger">Delete</button>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>
