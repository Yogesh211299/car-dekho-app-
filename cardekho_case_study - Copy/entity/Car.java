package com.jspider.cardekho_case_study.entity;

public class Car {
	private int carId;
	private String name;
	private String brand;
	private String model;
	private String fuelType;
	private double price;
	
	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId (int carId) {
		this.carId=carId;
	}
	public String getName() {
		return name;
	}
    public void setName (String name) {
		this.name=name;
	}
	public String getBrand() {
		return brand;
	}
    public void setBrand (String brand) {
		this.brand= brand;
	}
	public String getModel() {
		return model;
	}
    public void setModel (String model) {
		this.model=model;
	}
	public String getFuelType() {
		return fuelType;
	}
    public void setFuelType (String fuelType) {
		this.fuelType=fuelType;
	}
	public double getPrice() {
		return price;
	}
    public void setPrice (double price) {
		this.price =price;
	}

	
    public String toString() {
    	
    	return  carId+"\t"+name+" \t\t "+brand+"\t\t"+model+"\t"+fuelType+"\t\t\t "+price; 
    }
    
    
    
}
