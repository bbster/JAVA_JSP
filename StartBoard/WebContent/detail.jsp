<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
<script src="./bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<h2>테스트 게시판 Detail</h2>
	<table class="table">
		<tr>
			<td colspan="2" style="text-align: center;">Detail</td>
		</tr>
		<tr>
			<td>글번호</td>
			<td>${bdto.bno}</td>
		</tr>
		<tr>
			<td>작성날짜</td>
			<td>${bdto.regdate}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${bdto.title}</td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>${bdto.author}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${bdto.content}</td>
		</tr>
		<tr>
			<td>연락처</td>
			<td>${bdto.email}</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: center;">
			<a href="./modify.do?clno=${bdto.bno}" class="btn btn-warning">수정</a>
			<a href="./remove.do?clno=${bdto.bno}" class="btn btn-danger">삭제</a> 
			</td>
			<td>
		</tr>
	</table>
	</div>
</body>
</html>