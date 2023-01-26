package fiftydayscode_Statements;
import java.util.Scanner;
public class IfElseStatements {

	public static void main(String[] args)
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a=vc.nextInt();
		System.out.print("Enter the Number: ");
		int b=vc.nextInt();
		/*the if-else statements contains the if condition becomes true then the
		 if block is execute otherwise the condition becomes false then else block is execute
		 */
		if(a>b)
		{
			System.out.println("The A is Bigger than B");
		}
		else
		{
			System.out.println("The B is Bigger than A");
		}
	}

}
