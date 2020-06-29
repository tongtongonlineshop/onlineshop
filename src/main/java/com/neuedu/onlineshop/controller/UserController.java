package com.neuedu.onlineshop.controller;

import com.neuedu.onlineshop.pojo.User;
import com.neuedu.onlineshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public User login(@RequestBody User user, HttpServletRequest request){//请求中传递json格式的对象，转为java中的对象
    	HttpSession session = request.getSession();
    	User loginUser = userService.login(user);
    	if(loginUser!=null) {
    		session.setAttribute("loginUser", loginUser);
    		return loginUser;
    	}
    	return null;
    }
}
