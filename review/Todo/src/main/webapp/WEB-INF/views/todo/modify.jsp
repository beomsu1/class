<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify Page</title>
</head>
<body>

<h1>Todo Modify</h1>

<form method="post">

번호 : <input type ="text" name="no" value="${todo.no}" readonly> <br>
할일 : <input type ="text" name="todo" value="${todo.todo}"> <br>
날짜 : <input type ="date" name="duedate" value="${todo.duedate}"> <br>
완료 : <input type ="checkbox" name="complete" value="${todo.complete}"> <br>
<input type="reset"> <input type="submit" value="수정">


</form>

</body>
</html>