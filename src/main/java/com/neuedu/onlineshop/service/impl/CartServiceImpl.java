package com.neuedu.onlineshop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.onlineshop.mapper.CartMapper;
import com.neuedu.onlineshop.pojo.Cart;
import com.neuedu.onlineshop.service.CartService;

import javax.annotation.Resource;

@Service
public class CartServiceImpl implements CartService {
	@Resource
	private CartMapper cartMapper;

	@Override
	public Map<Integer,Cart> getCartListByUserId(Integer userId) {
		List<Cart> cartList = cartMapper.getCartListByUserId(userId);
		Map<Integer,Cart> cartMap = new HashMap<>();
		for(Cart cart:cartList){
			cartMap.put(cart.getGoodsId(),cart);
		}
		return cartMap;
	}

}
