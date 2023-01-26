package fiftydayscode_Statements;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner vc=new Scanner(System.in);
		int a=vc.nextInt();
		if(a%2==0)
		{
			System.out.println("The Even Number..!!");
			if(a/2==0)
			{
				System.out.println("The A is Divisible by 2");
			}
			else
			{
				System.out.println("The A is Not Divisible by 2");
			}
		}
		else 
		{
			System.out.println("The Odd Number..!!");
		}
	}

}
