package fiftydayscode_practice_day1;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner vc=new Scanner(System.in);
		System.out.println("WELCOME TO MY CALCULATOR.....");
		System.out.println("===============================");
		System.out.println();
		System.out.print("Enter First Number : ");
		double a=vc.nextDouble();
		System.out.println();
		System.out.print("Enter the Operator : ");
		String op=vc.next();
		System.out.println();
		System.out.print("Enter Second Number : ");
		double b=vc.nextDouble();
		System.out.println();
		try
		{
			switch(op)
			{
			case "+":
				System.out.println("The Addition is "+(a+b));
				break;
			case "-":
				System.out.println("The Subtraction is "+(a-b));
				break;
			case "*":
				System.out.println("The Multiplication is "+(a*b));
				break;
			case "/":
				System.out.println("The Division is "+(a/b));
				break;
			case "%":
				System.out.println("The Modulus Division is "+(a%b));
				break;
			default:
				System.out.println("Invalid Operator..!!");
			}
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input..!!");
		}
		finally {
			System.out.println();
			System.out.println("==========================================");
			System.out.println(">>>>>>>>>>>>>>  THANK YOU <<<<<<<<<<<<<<<<");
			System.out.println("==========================================");
		}
	}

}
