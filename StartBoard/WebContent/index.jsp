<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
<script src="./bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>연습용 게시판 글쓰기</h1>
		<form action="./writeSave.do" method="post">
			<div class="form-group">
				<label for="email">제목</label> <input type="text"
					class="form-control" placeholder="제목 입력" name="title" required>
			</div>

			<div class="form-group">
				<label for="email">글쓴이</label> <input type="text"
					placeholder="글쓴이를 입력하세요!" name="author" required>
			</div>

			<div class="form-group">
				<label for="email"> 내용 </label>
				<textarea cols="40" rows="5" name="content" class=form-control></textarea>
			</div>

			<div class="form-group">
				<label for="email"> 연락처</label> <input type="email"
					placeholder="이메일을 입력하세요!" name="email" required>
			</div>
			
			<div class="form-group">
			<input type="submit" value="글작성 완료">&nbsp;
			<input type="reset" value="다시작성">
			</div>

		</form>
		<a href="./list.do" style="font-size: 20px">리스트 가기</a>
	</div>
</body>
</html>