package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 12:11:38 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

/* Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */

public class Time {
	private int hrs, min, sec;

	//Parameterized Constructor
	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	
	
	
	
	public void add(Time obj) {
		
		//Adding Seconds
//		this.sec += obj.sec;
//		if(this.sec >= 60 && this.sec <= 119) {
//			this.min += 1;
//			this.sec -= 60;
//		}
//		
//		if(this.sec == 120) {
//			this.min += 2;
//			this.sec -= 120;
//		}
		
		//Adding Minutes
//		this.min += obj.min;
//		if(this.min >= 60) {
//			this.hrs += 1;
//			this.min -= 60
//		}
//		Adding Hours
//		this.hrs += obj.hrs;
		
		this.hrs += obj.hrs;
		
		this.min += obj.min;
		if(min > 60) {
			hrs++;
			if(this.hrs > 24) {
				this.hrs -= 24;
			}
			this.min -= 60;
		}
		this.sec += obj.sec;
		if(this.sec > 60) {
			this.min++;
			if(this.hrs > 24) {
				this.hrs -= 24;
			}
			this.sec -= 60;
		}
	}
	
	public void display() {
		System.out.println("Time is: " + hrs + ":" + min + ":" + sec);
	}
}
