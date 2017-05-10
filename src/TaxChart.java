/* CSC1021 Programming I Project 1
 * 2016-11-09 
 * Author : Matas Zilaitis
 */



public class TaxChart {
	
	BOGOFF income = new BOGOFF(); 
	
	// constructor
	
	public TaxChart(int [] incomeArray ){ 
		int [] income = {25, 50, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 500, 550};
	}
	
	
	public void draw(int[] income){
		// creates two arrays of bars, which will  be used as incomes and taxes
		
		int size = income.length;

		
		Bar[] incomeLeftBar = new Bar[size]; 
		Bar[] taxes = new Bar[size];
		
		//space between bars
		int barHorizontal = -60; 
		int barVertical = 0;
		
		// initialization of X and Y axis, which will be created using bars
		Bar xAxis = new Bar();
		Bar yAxis = new Bar(); 
		
		// Parameters of X axis
		
		xAxis.width= 330; 
		xAxis.moveHorizontal(-70);
		xAxis.moveVertical(235);
		xAxis.changeColour(Colour.BLUE);
		xAxis.height = 1;
		xAxis.makeVisible();
		
		// Parameters of Y axis
		
		yAxis.width= 1; 
		yAxis.moveHorizontal(-50);
		yAxis.moveVertical(-200);
		yAxis.changeColour(Colour.BLUE);
		yAxis.height = 500;
		yAxis.makeVisible();
		
		//check all elements in array and make sure they are of correct type
		
		
		
		
		

		// we know how many values are provided by the length of an array
		// a for statement will run until last element of array is reached
		
		System.out.println(" i  " + "totalIncome" + "  incomeLeft" + "  tax");

		for(int i=0;i<size;i++){
			
		// Takes a value from income[] array.
		double incomeSize = income[i];
		
		
		if(incomeSize <0){
			incomeSize =0;
		}
		
		// Applies the value for taxPayable method and assigns it to taxSize
		int taxSize = (int) TaxCalculator.taxPayable(incomeSize); 
		// Applies the value for incomeLeft method an assigns it to incomeLeft
		int incomeLeft = (int) TaxCalculator.incomeLeft(incomeSize); 
		int totalIncome = taxSize + incomeLeft;
		
		System.out.println(String.format("%2d", i) + String.format("%8d",totalIncome) +  String.format("%10d", incomeLeft) + " " +String.format("%11d", taxSize));

		
		// visual adjustments
		barHorizontal +=12; 
		barVertical +=10;
		 
		//initializes bars
		incomeLeftBar[i] = new Bar();
		taxes[i] = new Bar();  
			
		// visual adjustments
		incomeLeftBar[i].moveHorizontal(20);
		taxes[i].moveHorizontal(20);
		
		
		// scaling the chart, dividing values by 2  
		incomeLeftBar[i].height = (int) incomeLeft/2;
		taxes[i].height = (int) taxSize/2;		

		
		// vertical and horizontal visual adjustments
		incomeLeftBar[i].moveVertical(235-incomeLeftBar[i].height);
		//  space between bars
		incomeLeftBar[i].moveHorizontal(barHorizontal);
		//sets the width of the incomeLeftBar bars.
		incomeLeftBar[i].width = 3;
		//makes incomeLeftBar bars visible.
		incomeLeftBar[i].makeVisible(); 
		//changes incomeLeftBar bars colour.
		incomeLeftBar[i].changeColour(Colour.YELLOW);
		
		
		
		
		// vertical and horizontal visual adjustments
		// puts the taxes chart on top of the incomeLeftBar bar
		taxes[i].moveVertical(-(2*incomeLeftBar[i].height)-50);
		// 285 - constant number with which :
		// the bars are not upside down.
		// the taxes bars land on top of the incomeLeftBar bars correctly.
		taxes[i].moveVertical(285-taxes[i].height);
		
		taxes[i].moveVertical(incomeLeftBar[i].height);
		//  space between bars
		taxes[i].moveHorizontal(barHorizontal);
		taxes[i].width = 3;
		// makes taxes bars visible
		taxes[i].makeVisible();
		//changes taxes bars colour
		taxes[i].changeColour(Colour.RED);
			}
		}
	
	
	
}
