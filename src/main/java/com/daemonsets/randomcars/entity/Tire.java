package com.daemonsets.randomcars.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tire {

	private String manufacturer;

	@JsonProperty(value = "diameter")
	private int size;

	@JsonIgnore
	private int price;

	public Tire() {

	}

	public Tire(String manufacturer, int size, int price) {
		super();
		this.manufacturer = manufacturer;
		this.size = size;
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tire [manufacturer=" + manufacturer + ", size=" + size + ", price=" + price + "]";
	}

}
