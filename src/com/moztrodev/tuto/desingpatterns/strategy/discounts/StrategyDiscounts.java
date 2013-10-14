/**
 * 
 */
package com.moztrodev.tuto.desingpatterns.strategy.discounts;

import com.moztrodev.tuto.desingpatterns.strategy.model.Sale;

/**
 * @author DANIEL
 *
 */
public class StrategyDiscounts implements IStrategyDiscounts {

	@Override
	public double applyDiscount(Sale sale) {
		double result = sale.getPrice() - (sale.getPrice()*sale.getDiscount());
		return result;
	}
	
}
