package com.mvc.formBean;

public class LoginFormBean {
	//帳號
	private String account;
	
	//密碼
	private String password;
	
	//電子郵件
	private String email;
	
	//註冊帳號
	private String registerAccount;
	
	//註冊密碼
	private String registerPassword;
	
	//註冊密碼二次確認
	private String registerPasswordCheck;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegisterAccount() {
		return registerAccount;
	}
	public void setRegisterAccount(String registerAccount) {
		this.registerAccount = registerAccount;
	}
	public String getRegisterPassword() {
		return registerPassword;
	}
	public void setRegisterPassword(String registerPassword) {
		this.registerPassword = registerPassword;
	}
	public String getRegisterPasswordCheck() {
		return registerPasswordCheck;
	}
	public void setRegisterPasswordCheck(String registerPasswordCheck) {
		this.registerPasswordCheck = registerPasswordCheck;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
