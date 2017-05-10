/* CSC1021 Programming I Project 1
 * 2016-10-25 
 * Author : Matas Zilaitis
 */

import java.math.*;
public class TaxCalculator {
	
	// tax ranges
	
	public static final int zone1 = 101;
	public static final int zone2 = 151;
	public static final int zone3 = 201;
	public static final int zone4 = 301;
	public static final int zone5 = 401;
	
	// quotients/multipliers
	
	public static final double quot1 = 0.1;
	public static final double quot2 = 0.2;
	public static final double quot3 = 0.4;
	public static final double quot4 = 0.6;
	public static final double quot5 = 1.2;
	
	
	
	
	// method which calculates taxes.
	
	public static double taxPayable(double income){
		
		
		//returnable variable
		double tax =0;
		
		if(income <=0){
			return 0; // means that its invalid 
		}
		
		/* this method takes a parameter and then assigns it to a certain range.
		   it calculates the tax needed to pay in that range and adds it to "tax" variable.
		   after that the method assigns income to the lower range(zone) and keeps doings that until it reaches zone1.
		   Anything below zone1(101) is not taxable and program reaches the end, returning "tax" variable.
		   
		*/
		
		if(income >= zone5){
			tax= tax + (income -(zone5-1))*1.2;
			income = zone5-1;
		}
		if(income >= zone4){
			tax = tax + (income - (zone4-1))*0.6;
			income = zone4-1;
		}
		if(income >= zone3){
			tax = tax + (income - (zone3-1))*0.4;
			income = zone3-1;
		}
		if(income>=zone2){
			tax = tax + (income - (zone2-1))*0.2;
			income = zone2-1;
		}
		if(income>=zone1){
			tax = tax + (income - (zone1-1))*0.1;
		}
		
		//rounding a number using a method from Math library
		tax = Math.round(tax);
		
		//returning an integer
		return (int)tax;
	}
	
	
	// method which calculates income left after tax
	public static double incomeLeft(double income){
		double tax =  taxPayable(income);
		double incomeLeftNumber = income - tax;
		return (int) incomeLeftNumber;
		
		
	}
}
