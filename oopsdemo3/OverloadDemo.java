package oopsdemo3;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 2:33:51 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

class Addition {

	public void add(){
        System.out.println("Method OverLoading demo");
    }
    public void add(int a,int b){
        System.out.println("The Addition of 2 Nos is : "+(a+b));
    }
    public void add(double a,double b){
        System.out.println("The Addition of 2  float Nos is : "+(a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("The Addition of3 Nos is : "+(a+b+c));
    }
    public void add(String s1,String s2){
        System.out.println("The Addition of 2 Strings is : "+(s1+s2));
    }

}

public class OverloadDemo{
	public static void main(String[] args) {
		Addition a1 = new Addition();
		
		//Invoke Overload add() Method
		a1.add();
		a1.add(20, 30);
		a1.add(34.55f, 530.50f); //Type Promotion -- Float -> Double
		a1.add(100, 300, 600);
		a1.add("Java ", "Programming");
	}
}
