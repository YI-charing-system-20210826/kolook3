<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>一覧</title>
	</head>
<body>
	<div th:fragment="list_contents">
	<%@ include file="getList.jsp" %>
	</div>
</body>
</html>