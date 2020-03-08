
package chapter8;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;


public  class Airconditiner{
	private String color;
	private double horsePower;
	private int tempreture;
	
	public Airconditiner() {}
	
	
	public Airconditiner(String acColor) {
		this(acColor,BigDecimal.ZERO.doubleValue());
	}
  }
 

