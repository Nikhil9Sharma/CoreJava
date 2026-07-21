package ExceptionHandling;

import java.util.Scanner;

public class Exceptions {
	static Scanner sc = new Scanner(System.in);
	public static void Remainder(){
		System.out.println("Enter the Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Number : ");
		int num2 = sc.nextInt();
		Exceptions.findRemainder(num1,num2);
    }
	public static int findRemainder(int number1, int number2) {
		try {
			int remainder = number1 % number2;
			System.out.println("Remainder is: " + remainder);
			return remainder;
		} catch (ArithmeticException e) {
			System.out.println("Number cannot be divided by zero.");
			return -1;
		} finally {
			System.out.println("Program Finished");
		}
	}
	public static void ArrayIndexOutOfBondsException(){
		int[] arr = {10,20, 30};
		try{
			System.out.println("Array Elements is "+ arr[3]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("He cause the Error Because "+e.getMessage());
		} finally {
			System.out.println("Program Finally Ended;");
		}
	}
}