package com.daemonsets.randomcars.common;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.daemonsets.randomcars.entity.CarPromotion;
import com.daemonsets.randomcars.repository.CarPromotionElasticRepository;

@Component
public class CarPromotionElasticDatasource {

	@Autowired
	private CarPromotionElasticRepository carPromotionElasticRepository;

	private static final Logger LOG = LoggerFactory.getLogger(CarPromotionElasticDatasource.class);

	@EventListener(ApplicationReadyEvent.class)
	public void populateData() {
		carPromotionElasticRepository.deleteAll();

		var carPromotions = new ArrayList<CarPromotion>();

		var promotion1 = new CarPromotion();
		promotion1.setType("bonus");
		promotion1.setDescription("Purchase in cash and get free luxury dinner");

		var promotion2 = new CarPromotion();
		promotion2.setType("bonus");
		promotion2.setDescription("Purchase luxury car and get free trip to Japan");

		var promotion3 = new CarPromotion();
		promotion3.setType("bonus");
		promotion3.setDescription("Purchase two cars and get 20 gram of gold");

		var promotion4 = new CarPromotion();
		promotion4.setType("discount");
		promotion4.setDescription("Purchase in cash and 1% discount");

		var promotion5 = new CarPromotion();
		promotion5.setType("discount");
		promotion5.setDescription("Purchase before end of month to get 1.5% discount");

		var promotion6 = new CarPromotion();
		promotion6.setType("discount");
		promotion6.setDescription("Today only! We gives 0.5% additional discount");

		carPromotions.add(promotion1);
		carPromotions.add(promotion2);
		carPromotions.add(promotion3);
		carPromotions.add(promotion4);
		carPromotions.add(promotion5);
		carPromotions.add(promotion6);

		carPromotionElasticRepository.saveAll(carPromotions);

		LOG.info("Saved dummy promotion data : {}", carPromotionElasticRepository.count());
	}

}
