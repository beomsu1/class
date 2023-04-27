<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<h1>Form Test</h1>

	<form action="<%= request.getContextPath() %>/form/input.jsp" method="post">
		내용입력 <br>
		<textarea name="content" rows="5" cols="20">안녕하세요!</textarea> <!--안에 집어넣으면 기본값 -->
		<br> 
		성별 <input type="radio" name="gender" value="male" >남성
		 <input type="radio" name="gender" value="female" checked>여성
		 <!-- 라디오는 동글뱅이 checked 는 기본값체크(동글뱅이)  -->
		<br>
		관심사 : <input type = "checkbox" name = "lang" value="java" checked>java
		<input type = "checkbox" name = "lang" value="jsp">jsp 
		<input type = "checkbox" name = "lang" value="sql">sql 
		<input type = "checkbox" name = "lang" value="html">html

		<br>
		태어난 년도 : 
		<select name = "birthyear">
		<option value="2002">2002</option> <!--value를 안적으면 <>요기<>안에 들어있는 값 반환(2002.. 등)  -->
		<option>2001</option>
		<option>2000</option>
		<option>1999</option>
		<option>1998</option>
		
		</select>
		
		<br>
		나이 : <input type="number" name ="age">
		
		<br>
		생일 : <input type="date" name ="birthday">
		
		<br><br>
		
		<input type="submit">
		


	</form>



</body>
</html>