package com.daemonsets.randomcars.api.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daemonsets.randomcars.entity.CarPromotion;
import com.daemonsets.randomcars.exception.IllegalApiParamException;
import com.daemonsets.randomcars.repository.CarPromotionElasticRepository;
import com.daemonsets.randomcars.service.CarPromotionService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/api/car/v1")
@Tag(name = "Car Promotion API", description = "Documentation for Car Promotion API")
public class CarPromotionApi {

	@Autowired
	private CarPromotionService carPromotionService;

	@Autowired
	private CarPromotionElasticRepository carPromotionElasticRepository;

	@GetMapping(value = "/promotions")
	public List<CarPromotion> listAvailablePromotions(@RequestParam(name = "type") String promotionType,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
		if (!carPromotionService.isValidPromotionType(promotionType)) {
			throw new IllegalApiParamException("Invalid promotion type : " + promotionType);
		}

		var pageable = PageRequest.of(page, size);
		return carPromotionElasticRepository.findByType(promotionType, pageable).getContent();
	}

}
