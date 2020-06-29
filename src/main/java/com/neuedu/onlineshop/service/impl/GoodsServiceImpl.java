package com.neuedu.onlineshop.service.impl;

import com.neuedu.onlineshop.mapper.GoodsMapper;
import com.neuedu.onlineshop.pojo.Goods;
import com.neuedu.onlineshop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodsListByCondtions(Map<String, Object> goodsMap) {
        return goodsMapper.getGoodsListByCondtions(goodsMap);
    }

    @Override
    public int getCount(Map<String, Object> goodsMap) {
        return goodsMapper.getCount(goodsMap);
    }

    @Override
    public int saveGoods(Goods goods) {
        return goodsMapper.insertSelective(goods);
    }

	@Override
	public int updateGoods(Goods goods) {
		return goodsMapper.updateByPrimaryKeySelective(goods);
	}

	@Override
	public Goods selectByPrimaryKey(Integer id) {
		return goodsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateState(Map<String, Object> stateMap) {
		// TODO Auto-generated method stub
		return goodsMapper.updateState(stateMap);
	}

}
