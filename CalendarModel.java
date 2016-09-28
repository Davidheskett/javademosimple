/**
 * class CalendarModel
 * @author David Heskett
 * @date Created: 09/27/2016
 * @copyright Copyright (c) 2016 David Heskett
 *
 * @todo 
 * 
 * 

@abstract
Calendar model base.

*/

public class CalendarModel {
	private int year; 
	private int month; 
	private int day; 
	
	/**
	*  CalendarModel -  constructor
	*/
	CalendarModel() {
		year  = 2015;
		month = 1;
		day   = 15;
	}
	
	/**
	*  dump -  show object data
	*/
	public void dump() {
		System.out.println("Year:  " + year);
		System.out.println("Month: " + month);
		System.out.println("Day:   " + day);
	}
	
	/**
	*  init -  initialize values
	*/
	public void init() {
		setYear(2016);
	}
	
	/**
	*  setYear - setter
	*/
	public void setYear(int val) {
		year = val;
	}
	
	/**
	*  getYear - getter
	*/
	public int getYear() {
		return year;
	}
	
	/**
	*  setMonth - setter
	*/
	public void setMonth(int val) {
		month = val;
	}
	
	/**
	*  getMonth - getter
	*/
	public int getMonth() {
		return month;
	}
	
	/**
	*  setDay - setter
	*/
	public void setDay(int val) {
		day = val;
	}
	
	/**
	*  getDay - getter
	*/
	public int getDay() {
		return day;
	}
	
	/**
	*  stub -  
	*/
	public int stub(String name) {
		int ret = 0;
		
		int len = name.length();
		
		return ret;
	}
	
}  // end class
// ****************************************
// ****************************************
// ****************************************
