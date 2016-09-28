/**
 * class Demo
 * @author David Heskett
 * @date Created: 09/27/2016
 * @copyright Copyright (c) 2016 David Heskett
 *
 * @todo 
 * 
 * 

@abstract
Demo file.

*/

public class Demo {
	/**
	*  main -  run the demo
	*/
	public static void main(String[] args) {
		CalendarModel x = new CalendarModel();
		
		int testval = 2014;
		
		int year = x.getYear();
		      
		x.dump();
		
		String yearStr = Integer.toString(year);
		
		System.out.println("Demo: year(" + yearStr + ")");
		
		x.setYear(testval);
		year = x.getYear();
		yearStr = Integer.toString(year);
		System.out.println("Demo: set year(" + yearStr + ")");
		
		x.init();
		year = x.getYear();
		yearStr = Integer.toString(year);
		System.out.println("Demo: init year(" + yearStr + ")");
		
	}
}  // end class
// ****************************************
// ****************************************
// ****************************************
