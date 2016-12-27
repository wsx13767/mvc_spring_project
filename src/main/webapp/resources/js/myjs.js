$(document).ready(function() {
});
//登入帳密判斷
function login(){
	$.ajax({
		type : "post",
		data : $("#loginform").serialize(),
		url : "/training-project/login/logincheck",
		success : function (data) {
				if (data == "success") {
			//		document.action = '/training-project/';
					$("#loginform").attr("action","/training-project/");
				    $("#loginform").submit();
				} else if (data == "false") {
					$("#loginError").html("password is error");
				}

		}
	});
}