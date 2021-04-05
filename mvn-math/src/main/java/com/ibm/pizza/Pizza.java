package com.ibm.pizza;

public class Pizza {
	
	public double order(String size,int topping) throws PizzaOrderException {
		
		
			if(topping>=2 && topping <=5 ) {
				if(size=="S") {
					return 100+topping*50;
				}
				else if(size=="M") {
					return 200+topping*50;
				}
				else if(size=="L")
					return 300+topping*50;
				else
					throw new PizzaOrderException("Invalid Pizza size");
			}else {
				throw new PizzaOrderException("Invalid topping count");
			}
	}
}
