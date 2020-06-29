package com.neuedu.onlineshop.controller.portal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.onlineshop.pojo.Cart;
import com.neuedu.onlineshop.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private CartService cartService;
	@RequestMapping("/list")
	public List<Cart> getCartList(@RequestParam("userId") Integer userId){
		return new ArrayList<>(cartService.getCartListByUserId(userId).values());
	}
}
