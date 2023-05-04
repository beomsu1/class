<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Todo Read</h1>

번호 : <input type="text" name="no" value="${no}" readonly> <br>
할일 : <input type="text" name="todo" value="${todo}" readonly> <br>
날짜 : <input type="date" name="duedate" value ="${duedate}" readonly> <br>
완료 : <input type="checkbox" name="complete" value=${complete == 'done' ? 'ckecked' : ''}> <br>
<a href="modify?no=${no}">수정</a>
<form action="delete" method="post">
<input type="hidden" value="${no}">
<input type="submit" value="삭제">
</form>

</body>
</html>