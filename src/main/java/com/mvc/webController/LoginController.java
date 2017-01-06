package com.mvc.webController;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.formBean.LoginFormBean;

import com.mvc.service.UserService;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	 * 登入頁面
	 * @param req
	 * @param res
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String getpage(HttpServletRequest req, HttpServletResponse res) {
		return "/jsp/login";
	}
	
	/**
	 * 登入帳密確認
	 * Session設定
	 * @param formBean 頁面傳出之帳號密碼
	 * @param req 需求
	 * @param res 回應結果
	 * @throws IOException
	 */
	@RequestMapping(value = "/logincheck",method = RequestMethod.POST)
	public @ResponseBody void logincheck(LoginFormBean formBean, HttpServletRequest req,
			HttpServletResponse res) throws IOException {	
		String account = formBean.getAccount();
		String password = formBean.getPassword();
		
		boolean result = false;
		if (account == null || password == null) {
			return;
		} else {
			result = userService.logincheck(formBean.getAccount(), formBean.getPassword());
			if (result) {
				req.getSession().setAttribute("login", account);
			}
		}
	    System.out.println(result);
	    res.getWriter().print(result);
	}
	
	/**
	 * 登出
	 * Session清除
	 * @param res 需求
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public @ResponseBody void logout(HttpServletRequest req) throws IOException {
		req.getSession().invalidate();
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public @ResponseBody void register(LoginFormBean formBean, HttpServletResponse res, HttpServletRequest req) 
			throws IOException {
		boolean result = false;
		String registerAccount = formBean.getRegisterAccount();
		String registerPassword = formBean.getRegisterPassword();
		String registerPasswordCheck = formBean.getRegisterPasswordCheck();
		String email = formBean.getEmail();
		
		//傳至jsp為utf-8
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		res.setHeader("Cache-Control", "no-cache");
		
		
		if (registerAccount == null || registerAccount == ""
				|| registerPassword == null || registerPassword == ""
				|| registerPasswordCheck == null || registerPasswordCheck == ""
				|| email == null || email == "") {
			res.getWriter().print("資料有誤");
		} else {
			boolean accountCheck = userService.accountCheck(registerAccount);
			if (accountCheck) {
				res.getWriter().print("帳號重複");
			} else {
				if (!registerPassword.equals(registerPasswordCheck)) {
					res.getWriter().print("兩次密碼不同");
				} else {
					result = userService.register(registerAccount, registerPassword, email);
					res.getWriter().print(result);
				}
			}
		}
	}
	
	
}
