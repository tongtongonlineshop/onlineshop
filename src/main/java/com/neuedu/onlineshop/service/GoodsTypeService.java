package com.neuedu.onlineshop.service;

import com.neuedu.onlineshop.pojo.GoodsType;

import java.util.List;

public interface GoodsTypeService {
    //获取所有商品类型列表
    List<GoodsType> getGoodsTypeList();
}
