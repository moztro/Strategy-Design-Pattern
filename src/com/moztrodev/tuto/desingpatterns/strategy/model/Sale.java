/**
 * 
 */
package com.moztrodev.tuto.desingpatterns.strategy.model;

/**
 * @author DANIEL
 *
 */
public class Sale {
	private double price;
	private double discount;
	
	public Sale(){}
	
	public Sale(double _price, double _discount){
		setPrice(_price);
		setDiscount(_discount); 
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double d) {
		this.discount = d;
	}
	
	
}
