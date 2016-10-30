<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><c:if test="${not empty hello }">${hello }</c:if> </title>
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