<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<body>
	<%@ include file="../goods/top.jsp" %>
	<h3>상품 삭제</h3>
	<table border=1>    
        <tr>
        
        <form action="${pageContext.request.contextPath}/dz" method="get">
        	<td>삭제품목 : <input type="text" name="name"> </td>
        	<td><input type="submit" value="삭제"></td>
        </form>        	
         
       
    </table>
</body>
</html>
<script>
	

</script>