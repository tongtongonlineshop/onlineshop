package com.neuedu.onlineshop.controller.portal;

import com.neuedu.onlineshop.pojo.Carousel;
import com.neuedu.onlineshop.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/portal/carousel")
public class CarouselPortalController {
	@Autowired
	private CarouselService carouselService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Carousel> getCarouselList(){
		return carouselService.getCarouselList();
	}

}
