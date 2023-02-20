package fiftydayscode_practice_day2;
import java.util.Scanner;
public class FactorialNumber 
{

	public static void main(String[] args) 
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the number for calculating factorial : ");
		int a=vc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is "+fact);
	}

}
