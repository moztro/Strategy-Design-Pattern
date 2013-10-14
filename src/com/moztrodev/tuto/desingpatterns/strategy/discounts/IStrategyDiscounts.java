/**
 * 
 */
package com.moztrodev.tuto.desingpatterns.strategy.discounts;

import com.moztrodev.tuto.desingpatterns.strategy.model.Sale;

/**
 * @author DANIEL
 *
 */
public interface IStrategyDiscounts {

	double applyDiscount(Sale sale);
}
