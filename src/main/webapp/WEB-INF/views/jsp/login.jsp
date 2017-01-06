<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<jsp:include page="fragments/scriptInclude.jsp" />
<jsp:include page="fragments/cssInclude.jsp" />
</head>
<body>
	<!-- header -->
	<jsp:include page="fragments/header.jsp" />
	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						<form id="loginform" method="post">
							<input type="text" name="account" placeholder="Account" />
							<input type="password" name="password" placeholder="password" />
							<span>
								<input type="checkbox" class="checkbox"> 
								Keep me signed in
							</span>
							<button type="button" class="btn btn-default" onclick="login()">Login</button>
						</form>
						<div id="loginError"></div>
					</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User Signup!</h2>
						<form id="registerForm">
							<input type="text" name="registerAccount" placeholder="Account"/>
							<input type="email" name="email" placeholder="Email Address"/>
							<input type="password" name="registerPassword" placeholder="Password"/>
							<input type="password" name="registerPasswordCheck" placeholder="Password"/>
							<button type="button" class="btn btn-default" onclick="register()">Signup</button>
						</form>
						<div id="registerMessage"></div>
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->
	
	<!-- footer -->
	<jsp:include page="fragments/footer.jsp" />
</body>
</html>