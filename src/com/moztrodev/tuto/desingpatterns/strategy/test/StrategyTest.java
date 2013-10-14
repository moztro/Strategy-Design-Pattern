/**
 * 
 */
package com.moztrodev.tuto.desingpatterns.strategy.test;

import com.moztrodev.tuto.desingpatterns.strategy.discounts.IStrategyDiscounts;
import com.moztrodev.tuto.desingpatterns.strategy.discounts.StrategyDiscountCustomerFrequent;
import com.moztrodev.tuto.desingpatterns.strategy.discounts.StrategyDiscountCustomerRegular;
import com.moztrodev.tuto.desingpatterns.strategy.discounts.StrategyDiscountCustomerVIP;
import com.moztrodev.tuto.desingpatterns.strategy.enums.Membership;
import com.moztrodev.tuto.desingpatterns.strategy.model.Customer;
import com.moztrodev.tuto.desingpatterns.strategy.model.Sale;

/**
 * @author DANIEL
 *
 */
public class StrategyTest {
	private static IStrategyDiscounts strategyDiscount;
	private static Customer customer;
	private static Sale sale;
	
	public static void main(String[] args){
		customer = new Customer("Daniel","Uribe Ayvar", Membership.VIP);
		sale = new Sale();
		sale.setPrice(1500);
		
		switch(customer.getMembership()){
			case VIP:
				strategyDiscount = new StrategyDiscountCustomerVIP();
				break;
			case FREQUENT:
				strategyDiscount = new StrategyDiscountCustomerFrequent();
				break;
			case REGULAR:
				strategyDiscount = new StrategyDiscountCustomerRegular();
				break;
		}
		double finalPrice = strategyDiscount.applyDiscount(sale);
		
		System.out.println("ORIGINAL PRICE: $" + sale.getPrice()
				+"\nFINAL PRICE: $"+finalPrice
				+"\nCLIENT: "+customer.getCustomerName()
				+"\nMEMBERSHIP: "+customer.getMembership());
	}
}
