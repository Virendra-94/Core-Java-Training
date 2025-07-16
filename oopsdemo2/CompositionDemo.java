package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 12:29:57 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

class Honda extends Car{
	
	public void hondaStart() {
		Engine heng = new Engine(); //Composition - Honda class fully dependent on Engine
		heng.startEngine();
	}
}

class Hyundai extends Car{
	
	public void hyundaiStart() {
		Engine heng = new Engine(); //Composition - Hyundai class fully dependent on Engine
		heng.startEngine();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		
        Honda hondaCity =new Honda();
		
		hondaCity.setColor("Silver"); //car class methods
		hondaCity.setMax_speed(180);	//car class methods
		
		System.out.println("*******Honda Car Details *********");
		System.out.println(hondaCity.getColor() +" Color");//car class methods
		System.out.println(hondaCity.getMax_speed()+" Speed");//car class methods
		
		hondaCity.hondaStart(); // honda class method-- > call ENgine class method
		
		
//		hondaCity=null;
//		System.gc();
		
		System.out.println(hondaCity.getColor());
		
		Hyundai h =new Hyundai();
		
		h.setColor("Silver");
		h.setMax_speed(180);	
		
		System.out.println("*******Honda Car Details *********");
		System.out.println(h.getColor() +" Color");
		System.out.println(h.getMax_speed()+" Speed");
		
		h.hyundaiStart();

	}

}
