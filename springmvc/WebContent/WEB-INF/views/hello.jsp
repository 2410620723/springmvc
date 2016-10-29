<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${hello }<br>
${hi }
<form action="put/1" method="post">
  <input type="hidden" name="_method" value="PUT">
  <input type="submit" value="put">
</form>

<form action="delete" method="post">
  <input type="hidden" name="_method" value="DELETE">
  <input name="id">
  <input type="submit" value="delete">
</form>
</body>
</html>