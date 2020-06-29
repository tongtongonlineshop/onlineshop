package com.neuedu.onlineshop.mapper;

import java.util.List;

import com.neuedu.onlineshop.pojo.Carousel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarouselMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Carousel record);

    int insertSelective(Carousel record);

    Carousel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carousel record);

    int updateByPrimaryKey(Carousel record);
    
    public List<Carousel> getCarouselList();
}