package com.neuedu.onlineshop.service;


import com.neuedu.onlineshop.pojo.Cart;

import java.util.Map;

public interface CartService {
	//根据用户id查购车列表
	Map<Integer,Cart> getCartListByUserId(Integer userId);
}
