<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dang Nhap</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body id="body-login">

	<div id="body-flex-login">
		<div id="container-login">

			<div id="container-login-left">
				<div id="header-top-left" class="header-top-login" >
					<span id="text-logo">Welcome</span></br>
					<span id="hint-text-logo">Hãy tạo nên phong cách của bạn</span>
				</div>

				<div  id="header-bottom-left">
					<p><img class="image-icion" alt="icon" src='<c:url value="/resources/image/icion.jpg" />'/><span>Luôn cập nhật xu hướng thời trang mới nhất</span></p>
					<p><img class="image-icion" alt="icon" src='<c:url value="/resources/image/icion.jpg" />'/><span>Giảm hơn 80% tất cả mặt hàng cho VIP</span></p>
					<p><img class="image-icion" alt="icon" src='<c:url value="/resources/image/icion.jpg" />'/><span>Tận tình tư vấn</span></p>
				</div>
			</div>

			<div id="container-login-right">

				<div id="header-top-right" class="header-login-right" >
						<span>Đăng Nhập</span>/<span>Đăng Ký</span>
				</div>

				<div id="container-center-right">
					<form action="">
						<input class="material-textinput" type="text" placeholder="Nhập user name" /> <br/>
						<input class="material-textinput" type="text" placeholder="Nhập password" /> <br/>
						<input class="material-textinput" type="submit"/> <br/>
					</form>
				</div>

				<div id="container-social-login">
					<img class="image-right" alt="icon" src='<c:url value="/resources/image/fb.jpg" />'/>
					<img class="image-right" alt="icon" src='<c:url value="/resources/image/google.png" />'/>
				</div>
			</div>



		</div>
	</div>
</body>
</html>