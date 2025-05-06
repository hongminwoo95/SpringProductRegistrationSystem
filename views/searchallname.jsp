<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../goods/top.jsp" %>
	<h3>전체상품 조회</h3>
	<hr>
	
	
	<table border=1>
		<tr>
			<td>상품명</td>
			<td>상품가격</td>
			<td>상품수량</td>
			<td>상품설명</td>
		</tr>
		
		<c:forEach var="list" items="${alllist}">		
		<tr>
			<td>${list.goodsname}</td>
			<td>${list.goodsprice}</td>
			<td>${list.goodscnt}</td>
			<td>${list.goodscomment}</td>
		</tr>		
		</c:forEach>
	</table>
	<hr>
	
	
</body>
</html>