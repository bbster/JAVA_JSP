<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9" id="customer-orders">
				<div class="box">
					<h1>회원 목록</h1>

					<hr>

					<div class="table-responsive">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>email</th>
									<th>nickname</th>
									<th>grade</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="mdto" items="${objList }">
									<tr>
										<th>${mdto.email }</th>
										<td>${mdto.nickname }</td>
										<td>${mdto.grade }</td>
										<td><a href="./member?sign=mdelete&email=${mdto.email }"
											class="btn btn-primary btn-sm">삭제</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>