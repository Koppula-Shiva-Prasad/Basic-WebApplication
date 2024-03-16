<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"
					placeholder="Enter your name"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email"
					placeholder="Enter your Email"></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" name="age"
					placeholder="Enter your Age"></td>
			</tr>
			<tr>
				<td>Date of Birth :</td>
				<td><input type="date" name="dateofbirth"
					placeholder="Enter your Date of Birth"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="SignUp"></td>
			</tr>
		</table>
	</form>
</body>
</html>