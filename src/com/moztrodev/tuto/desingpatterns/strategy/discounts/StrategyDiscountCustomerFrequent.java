/**
 * 
 */
package com.moztrodev.tuto.desingpatterns.strategy.discounts;

import com.moztrodev.tuto.desingpatterns.strategy.model.Sale;

/**
 * @author DANIEL
 *
 */
public class StrategyDiscountCustomerFrequent extends StrategyDiscounts {

	@Override
	public double applyDiscount(Sale sale){
		sale.setDiscount(0.2);
		double result = sale.getPrice() - (sale.getPrice()*sale.getDiscount());
		return result;
	}
}
