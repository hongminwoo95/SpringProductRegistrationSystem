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
	<h3>상품 등록</h3>
		<table border=1>		
        <tr>
	<form action="${pageContext.request.contextPath}/yz" method="post">
            <td>상품명 : <input type="text" name="goodsname" id="check"> <span id="checked">중복</span> </td>           
            <td>상품가격 : <input type="text" name="goodsprice"></td>
            <td>상품수량 : <input type="text" name="goodscnt"></td>
            <td>상품설명 : <input type="text" name="goodscomment"></td>
                <td><input type="submit" value="등록"></td>                 
    </form>
    	</tr>
    	</table>
</body>
</html>
<script>
	// jquery라는 js 라이브러리 : js의 자주 사용되는 기능으로 개발된 라이브러리
	// 설치는 주로 cdn방식으로 한다
	// jquery문법은 $로 시작됨
	$("#checked").click(()=>{
		let name = $("#check").val()
		alert(name)
		
		$.ajax({
			async:true, // false라고 하면 동기방식으로 설정
			url:"checked", // url이 된다
			data:{'name' : name},  // 키 : 값
			type:'GET', // 메서드 방식
			dataType:"text", // 보내는 타입
			
			success : function(data){ // 컨트롤러로 부터 넘겨받은 String자료형 text를
				if(data==''){
					alert("등록된 상품입니다 등록 불가판정")
					$("#check").val(''); // 입력란 초기화
					$("#checked").focus(); // focus() = 포커스 이동
				}else{
					alert("등록가능 상품입니다")
					$("#check").text(data)
				}
				
			},
			error : function(){ // 서버 연결 실패시
				alert("통신오류")
			}
			
		})		
		
		
	})
</script>