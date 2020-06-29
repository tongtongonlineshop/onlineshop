package com.neuedu.onlineshop.mapper;

import java.util.List;

import com.neuedu.onlineshop.pojo.Cart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
    
    List<Cart>getCartListByUserId(Integer userId);
}