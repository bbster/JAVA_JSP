<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Modify JSP</title>
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
<script src="./bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<h2>테스트 게시판 수정</h2>
	<form action="modifySave.do" method="POST">
		<input type="hidden" name="clno" value="${bdto.bno}">
		<table border="1">
			<tr>
				<td colspan="2" style="text-align: center;">Modify JSP</td>
			</tr>
			<div class="form-group"><label for="email"></label> ${bdto.bno}
			</div>
			<tr>
				<td>작성날짜</td>
				<td>${bdto.regdate}</td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" value="${bdto.title}"></td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="author" value="${bdto.author}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea cols="20" rows="5" name="content">${bdto.content}</textarea></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type="text" name="email" value="${bdto.email}"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
				<input type="submit" value="수정"> <input type="reset" value="초기화">
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>