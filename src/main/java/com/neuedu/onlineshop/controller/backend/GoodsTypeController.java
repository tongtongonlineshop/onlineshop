package com.neuedu.onlineshop.controller.backend;

import com.neuedu.onlineshop.pojo.GoodsType;
import com.neuedu.onlineshop.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goodsType")
public class GoodsTypeController {
    @Autowired
    private GoodsTypeService goodsTypeService;
    @RequestMapping("/list")
    public List<GoodsType> getGoodsTypeList(){
        return goodsTypeService.getGoodsTypeList();
    }

}
