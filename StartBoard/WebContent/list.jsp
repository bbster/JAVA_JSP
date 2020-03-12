<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>list.jsp</title>
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
<script src="./bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<h2>테스트 게시판 리스트</h2>
		<table class="table table-borderless">
			<thead>
				<tr>
					<th>게시판 번호</th>
					<th>글 제목</th>
					<th>작성자</th>
					<th>작성날짜</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${bList }" var="bdto">
					<tr>
						<td>${bdto.bno }</td>
						<td style="width: 200px;"><a
							href="./detail.do?clno=${bdto.bno }">${bdto.title }</a></td>
						<td style="width: 200px;">${bdto.author }</td>
						<td style="width: 200px;">${bdto.regdate }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>











