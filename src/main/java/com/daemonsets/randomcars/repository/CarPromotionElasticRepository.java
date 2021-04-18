package com.daemonsets.randomcars.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.daemonsets.randomcars.entity.CarPromotion;

@Repository
public interface CarPromotionElasticRepository extends ElasticsearchRepository<CarPromotion, String> {

	public Page<CarPromotion> findByType(String type, Pageable pageable);

}
