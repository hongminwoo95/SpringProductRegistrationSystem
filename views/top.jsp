<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<style>
    div{
        display: inline-block;
    }
</style>
<body>
	<div>
		<table border=1>
	 		<tr>
	 			<td><a href="${pageContext.request.contextPath}/myz">상품등록</a></td>
	 			<td><a href="${pageContext.request.contextPath}/goodsall">상품전체조회</a></td>
	 			<td><a href="${pageContext.request.contextPath}/mrz">상품조회</a></td>
	 			<td><a href="${pageContext.request.contextPath}/mdz">상품삭제</a></td>
	 			<td><a href="${pageContext.request.contextPath}/change">상품수정</a></td>
	 		</tr>
		</table>
	</div>	
	<hr>
</body>
</html>