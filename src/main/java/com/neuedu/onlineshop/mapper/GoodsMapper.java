package com.neuedu.onlineshop.mapper;

import com.neuedu.onlineshop.pojo.Goods;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);
    
    //多条件分页查询列表
    List<Goods> getGoodsListByCondtions(Map<String, Object> goodsMap);
    //获得总记录数-带多条件,分页需要用到：页数=count/pageSize
    int getCount(Map<String, Object> goodsMap);
    //修改商品状态：删除0,1已下架，2已上架
    int updateState(Map<String, Object> stateMap);
}