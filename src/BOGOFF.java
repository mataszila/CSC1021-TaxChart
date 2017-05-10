/* CSC1021 Programming I Project 1
 * 2016-11-09 
 * Author : Matas Zilaitis
 */




public class BOGOFF {
	public static void main (String [] args){
		// the array of incomes
		int [] incomeArray = {25, 50, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 500, 550};
		// initialization of TaxChart object chart
		TaxChart chart = new TaxChart(incomeArray);
		
		// execution of draw method using the incomeArray
		chart.draw(incomeArray); 
		
		
		
		
		
	}
}
