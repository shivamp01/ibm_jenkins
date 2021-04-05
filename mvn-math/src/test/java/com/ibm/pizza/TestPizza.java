package com.ibm.pizza;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPizza {
	
	Pizza p;
	
	@BeforeEach
	public void setup() {
		p=new Pizza();
	}
	
	@Test
	public void testSmallPizza() throws PizzaOrderException {
		assertEquals(250,p.order("S", 3));
	}
	
	@Test
	public void testMediumPizza() throws PizzaOrderException {
		assertEquals(200+4*50,p.order("M", 4));
	}
	
	@Test
	public void testLargePizza() throws PizzaOrderException {
		assertEquals(300+5*50,p.order("L", 5));
	}
	
	@Test
	public void testInvalidSize() {
		assertThrows(PizzaOrderException.class, ()->p.order("K", 3));
	}
	
	@Test
	public void testInvalidToppings(){
		assertThrows(PizzaOrderException.class,()-> p.order("M", 6));
	}

}
