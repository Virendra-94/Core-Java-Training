package basics;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		int a,b,c;

		String ad;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter name");
		ad=scanner.next();
		
		System.out.println("enter 3 no");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		int sum=a+b+c;
		float avg=(float)sum/3;
		System.out.format("%.2f", avg);
		
		scanner.close();

	}

}
