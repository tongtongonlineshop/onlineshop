package com.neuedu.onlineshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.onlineshop.mapper.CarouselMapper;
import com.neuedu.onlineshop.pojo.Carousel;
import com.neuedu.onlineshop.service.CarouselService;

import javax.annotation.Resource;

@Service
public class CarouselServiceImpl implements CarouselService {
	@Resource
	private CarouselMapper carouselMapper;

	@Override
	public List<Carousel> getCarouselList() {
		return carouselMapper.getCarouselList();
	}

}
