package com.daemonsets.randomcars.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "practical-java-2")
public class CarPromotion {

	private String type;

	private String description;

	@Id
	private String id;

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}
}
