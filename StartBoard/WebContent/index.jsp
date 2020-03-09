<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- w3c DTD 표준 basic인듯함 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form action="./writeSave.do" method="POST">
		<table>
			<tr>
				<td colspan="2" style="text-align: center;">연습용 게시판</td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" placeholder="제목을 입력하세요!" name="title"></td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" placeholder="글쓴이를 입력하세요!" name="author"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" placeholder="내용을 입력하세요!" name="content"></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type="email" placeholder="이메일을 입력하세요!" name="email"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="글 작성" />&nbsp; <input
					type="reset" value="지우기" /></td>
		</table>
	</form>
</body>
</html>