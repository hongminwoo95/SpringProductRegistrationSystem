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
	<h3>상품 내용 수정</h3>
	<table border=1>
		
		<form action="${pageContext.request.contextPath}/changename" method="post">
		<tr>
			<td>상품명(기존) : <input type="text" name="name"></td>
		</tr>
		<tr>
			<td>상품명(변경) : <input type="text" name="goodsname"></td>
			<td>상품가격(변경) : <input type="text" name="goodsprice"></td>
			<td>상품수량(변경) : <input type="text" name="goodscnt"></td>
			<td>상품설명(변경) : <input type="text" name="goodscomment"></td>
			<td><input type="submit" value="수정"></td>
		</tr>
		</form>
		
	
	</table>
</body>
</html>