package com.neuedu.onlineshop.service;

import com.neuedu.onlineshop.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    //多条件分页查询列表
    List<Goods> getGoodsListByCondtions(Map<String, Object> goodsMap);
    //获得总记录数-带多条件
    int getCount(Map<String, Object> goodsMap);
    //添加商品save***使用事务
    int saveGoods(Goods goods);
    //修改商品信息
    int updateGoods(Goods goods) ;
    //根据id查询商品信息
    Goods selectByPrimaryKey(Integer id);
    //修改商品状态：删除0,1已下架，2已上架
    int updateState(Map<String, Object> stateMap);
}
