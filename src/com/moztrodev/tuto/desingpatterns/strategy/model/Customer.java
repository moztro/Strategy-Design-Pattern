/**
 * 
 */
package com.moztrodev.tuto.desingpatterns.strategy.model;

import com.moztrodev.framework.model.Person;
import com.moztrodev.tuto.desingpatterns.strategy.enums.Membership;

/**
 * @author DANIEL
 *
 */
public class Customer extends Person {
	private Membership membership;
	
	public Customer(){
		super();
	}
	
	public Customer(String firstName, String lastName, Membership _membership){
		super(firstName, lastName);
		setMembership(_membership);
	}

	public Membership getMembership() {
		return membership;
	}

	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	
	public String getCustomerName(){
		return this.getFirstName()+" "+this.getLastName();
	}
}
