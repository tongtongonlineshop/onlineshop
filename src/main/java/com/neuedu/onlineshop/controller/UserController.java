package com.neuedu.onlineshop.controller;

import com.neuedu.onlineshop.common.RespBean;
import com.neuedu.onlineshop.pojo.User;
import com.neuedu.onlineshop.service.CartService;
import com.neuedu.onlineshop.service.UserService;
import com.neuedu.onlineshop.util.JWTUtil;
import com.neuedu.onlineshop.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * RestController:返回的数据都是json格式
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	private CartService cartService;
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ResponseData login(@RequestBody User user, HttpServletRequest request){//请求中传递json格式的对象，转为java中的对象
		User loginUser = userService.login(user);
		ResponseData responseData = ResponseData.ok();
		if(loginUser!=null) {
			//生成token
			String token = JWTUtil.generToken("1", "Jersey-Security-Basic", loginUser.getId().toString());
			//向浏览器返回token，客户端受到此token后存入cookie中，或者h5的本地存储中
			responseData.putDataValue("token", token);
			//以及用户
			responseData.putDataValue("user", loginUser);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser",loginUser);
//			session.setAttribute("cart",cartService.getCartListByUserId(loginUser.getId()));
		}else {
			//用户或者密码错误
			responseData=ResponseData.customerError();
		}
		return responseData;
	}
}
