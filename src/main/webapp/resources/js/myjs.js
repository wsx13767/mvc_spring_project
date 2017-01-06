$(document).ready(function() {
});
//登入帳密判斷
function login() {
	$.ajax({
		type : "post",
		data : $("#loginform").serialize(),
		url : "/training-project/login/logincheck",
		success : function (data) {
				if (data == "true") {
					$("#loginform").attr("action","/training-project/");
				    $("#loginform").submit();
				} else {
					$("#loginError").html("password is error");
				}

		}
	});
}

function logout() {
	$.ajax({
		type : "post",
		url : "/training-project/login/logout",
		success : function () {
			window.location = "/training-project/login";
		}
	});
}