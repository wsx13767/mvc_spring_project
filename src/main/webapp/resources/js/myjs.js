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
					$("#loginError").html("<div class=\"alert alert-danger alert-dismissible\" role=\"alert\">" +
							"<button type=\"button\" class=\"close\" data-dismiss=\"alert\">" +
							"<span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">" +
							"Close</span></button><strong>錯誤!</strong> " +
							"請重新確認帳號密碼 </div>");
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

function register() {
	$.ajax({
		type : "post",
		data : $("#registerForm").serialize(),
		url : "/training-project/login/register",
		success : function (data) {
			if (data == "true") {
				$("#registerMessage").html("<div class=\"alert alert-success alert-dismissible\" role=\"alert\">" +
						"<button type=\"button\" class=\"close\" data-dismiss=\"alert\">" +
						"<span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>" +
						"<strong>成功!</strong> 恭喜您完成會員註冊</div>");
				$("#registerForm").find(":input").each(function() {
					$(this).val("");
				});
			} else if (data == "false") {
				$("#registerMessage").html("<div class=\"alert alert-danger alert-dismissible\" role=\"alert\">" +
						"<button type=\"button\" class=\"close\" data-dismiss=\"alert\">" +
						"<span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>" +
						"<strong>錯誤!</strong> 會員未註冊成功</div>");
			} else {
				$("#registerMessage").html("<div class=\"alert alert-warning alert-dismissible\" role=\"alert\">" +
						"<button type=\"button\" class=\"close\" data-dismiss=\"alert\">" +
						"<span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>" +
						"<strong>警告!</strong>" + data + "</div>");
			}
		}
	});
}


function accountPage() {
	$.ajax({
		type : "post",
		data : {account:$("#account").val()},
		url : "/training-project/account/accountInfo",
//		cache: false,
//		dataType : 'json',
		success : function (data) {
			console.log(data.name);
			$("#accountForm").attr("action","/training-project/account");
		    $("#accountForm").submit();
		    
		}
	});
}