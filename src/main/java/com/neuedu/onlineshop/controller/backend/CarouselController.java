package com.neuedu.onlineshop.controller.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.onlineshop.pojo.Carousel;
import com.neuedu.onlineshop.service.CarouselService;

@RestController
@RequestMapping("/carousel")
public class CarouselController {
	@Autowired
	private CarouselService carouselService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Carousel> getCarouselList(){
		return carouselService.getCarouselList();
	}

}
