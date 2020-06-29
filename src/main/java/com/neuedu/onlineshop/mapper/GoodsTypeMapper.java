package com.neuedu.onlineshop.mapper;

import com.neuedu.onlineshop.pojo.GoodsType;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
    //获取所有商品类型列表
    List<GoodsType> getGoodsTypeList();
}