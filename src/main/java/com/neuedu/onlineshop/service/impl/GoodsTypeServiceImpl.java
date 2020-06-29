package com.neuedu.onlineshop.service.impl;

import com.neuedu.onlineshop.mapper.GoodsTypeMapper;
import com.neuedu.onlineshop.pojo.GoodsType;
import com.neuedu.onlineshop.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    private GoodsTypeMapper goodsTypeMapper;
    @Override
    public List<GoodsType> getGoodsTypeList() {
        return goodsTypeMapper.getGoodsTypeList();
    }
}
