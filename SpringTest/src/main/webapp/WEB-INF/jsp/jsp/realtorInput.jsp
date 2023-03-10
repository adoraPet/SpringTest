<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공인 중개사 정보입력</title>
<style>
body {
  background-color: #F9EBEA;
  font-family: Arial, sans-serif;
}

form {
  width: 80%;
  max-width: 500px;
  margin: 20px auto;
  padding: 20px;
  border: 2px solid #F44336;
  border-radius: 10px;
  box-shadow: 5px 5px 5px #888888;
}

h1 {
  text-align: center;
  font-size: 36px;
  color: #F44336;
}

label {
  display: block;
  font-size: 20px;
  color: #424242;
  margin-bottom: 10px;
}

input[type="text"] {
  font-size: 20px;
  padding: 8px;
  border: 2px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  width: 100%;
  margin-bottom: 20px;
}

button[type="submit"] {
  background-color: #F44336;
  color: white;
  font-size: 20px;
  padding: 10px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  margin-top: 10px;
}

button[type="submit"]:hover {
  background-color: #D32F2F;
}

</style>
</head>
<body>
	<h1>공인 중개사 추가</h1>
	<form method="post" action="/jsp/test02/add_realtor">
		<label>상호명</label><input type="text" name="office"><br>
		<label>전화번호</label><input type="text" name="phoneNumber"><br>
		<label>주소</label><input type="text" name="address"><br>
		<label>등급</label><input type="text" name="grade"><br>
		<button type="submit">추가</button>
	</form>

</body>
</html>