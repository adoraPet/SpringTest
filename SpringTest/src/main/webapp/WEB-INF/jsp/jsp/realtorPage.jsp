<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Realtor Information</title>
	<style>
		body {
 		 	background-color: #F9EBEA;
  			font-family: Arial, sans-serif;
		}

		table {
		  width: 80%;
		  max-width: 500px;
		  margin: 20px auto;
		  border-collapse: collapse;
		  border: 2px solid #F44336;
		  border-radius: 10px;
		  box-shadow: 5px 5px 5px #888888;
		}

		h1 {
		  text-align: center;
		  font-size: 36px;
		  color: #F44336;
		}
		
		th, td {
		  padding: 10px;
		  text-align: left;
		  border-bottom: 2px solid #F44336;
		}
		
		th {
		  background-color: #F44336;
		  color: white;
		  font-size: 20px;
		}
	</style>
	</head>
	<body>
		<h1>Realtor Information</h1>
		<table>
			<tr>
				<td>ID</td>
				<td>${realtor.id}</td>
			</tr>
			<tr>
				<td>상호명</td>
				<td>${realtor.office}</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>${realtor.phoneNumber}</td>
			</tr>
			<tr>
				<td>주소</td>
				<td>${realtor.address}</td>
			</tr>
			<tr>
				<td>등급</td>
				<td>${realtor.grade}</td>
			</tr>
		</table>
	</body>
	</html>