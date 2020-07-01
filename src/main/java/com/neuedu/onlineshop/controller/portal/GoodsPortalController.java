package com.neuedu.onlineshop.controller.portal;

import com.neuedu.onlineshop.common.RespBean;
import com.neuedu.onlineshop.pojo.Goods;
import com.neuedu.onlineshop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/portal/goods")
public class GoodsPortalController {
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
     * 根据ID查询商品信息
     *
     */
    @RequestMapping(value="/getGoodsById",method =RequestMethod.GET)
    public Goods getGoods(@RequestParam Integer id) {
        return goodsService.selectByPrimaryKey(id);
    }

}
