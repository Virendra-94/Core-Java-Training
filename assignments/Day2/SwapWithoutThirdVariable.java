package assignments.Day2;

//SwapWithoutThirdVariable.java
public class SwapWithoutThirdVariable {
 public static void main(String[] args) {
     int num1 = 10;
     int num2 = 20;

     System.out.println("Before swap: a = " + num1 + ", b = " + num2);

     num1 = num1 + num2;
     num2 = num1 - num2;
     num1 = num1 - num2;

     System.out.println("After swap: a = " + num1 + ", b = " + num2);
 }
}
