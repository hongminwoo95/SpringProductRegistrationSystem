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
	<div>
        <h3>상품 단일 조회</h3>        
	<table border=1>		
        <tr>
    <form action="${pageContext.request.contextPath}/rz" method="get">
    	<td>상품이름 : <input type="text" name="name">  </td>
    	<td><input type="submit" value="상품조회"></td>
 	 </form>
 	 </tr>
 	 </table>
	<hr>
 	<table>
            <tr>
                <td>상품명 : ${name.goodsname}</td>            
            </tr>
            <tr>
                <td>상품가격 : ${name.goodsprice}</td>            
            </tr> 
            <tr>
                <td>상품수량 : ${name.goodscnt}</td>            
            </tr> 
            <tr>
                <td>상품설명 : ${name.goodscomment}</td>            
            </tr> 
 	</table>
	</div>
</body>
</html>