package com.neuedu.onlineshop.controller.backend;

import com.neuedu.onlineshop.common.RespBean;
import com.neuedu.onlineshop.pojo.Goods;
import com.neuedu.onlineshop.service.GoodsService;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping(value = "/getGoodsList",method = RequestMethod.POST)
    public Map<String,Object> getGoodsListByConditionsPages(@RequestBody Map<String,Object> goodsMap){
        int count = goodsService.getCount(goodsMap);
        List<Goods> goodsList = goodsService.getGoodsListByCondtions(goodsMap);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("count",count);
        returnMap.put("list",goodsList);
        return returnMap;
    }
    /**
          * 保存商品数据：新增和修改
     * @param goods
     * @return
     */
    @RequestMapping(value = "/saveGoods",method = RequestMethod.POST)
    public RespBean saveGoods(@RequestBody Goods goods){
    	int result = 0;//操作结果
    	if(goods.getId()==null) {//新增
	        goods.setCreatetime(new Date());
	        result = goodsService.saveGoods(goods);
    	}else {//修改
    		result = goodsService.updateGoods(goods);
    	}
        if(result>0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
    /**
     * 根据ID查询商品信息
     * 
     */
    @RequestMapping(value="/getGoodsById",method =RequestMethod.GET)
    public Goods getGoods(@RequestParam Integer id) {
    	return goodsService.selectByPrimaryKey(id);
    }
    /***
     * 更新状态     * 
     */
    @RequestMapping(value="/updateState",method=RequestMethod.POST)
    public RespBean updateState(@RequestBody Map<String, Object> stateMap) {
    	int result = 0;//操作结果    	
	    result = goodsService.updateState(stateMap);    	
        if(result>0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
}
