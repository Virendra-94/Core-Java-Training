package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 3:18:10 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Implements Multiple Inheritance


class Result extends Candidate implements IExam{

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		System.out.println("*********** Candidate Result *************");
	}

	@Override
	public void percent_cal() {
		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println ("Percentage: "+percent+"%");
	}
		
}

public class MultipleDemo {

	public static void main(String[] args) {
		Result r1 = new Result("Jhon", 101, 65, 85);
		r1.display();
		r1.percent_cal();
	}
}
