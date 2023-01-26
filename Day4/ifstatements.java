package fiftydayscode_Statements;
import java.util.Scanner;
public class IfStatements {

	public static void main(String[] args)
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=vc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=vc.nextInt();
		//Now this program we define how to if condition work properly.. If return a boolean value
		//If condition becomes true then the block is execute otherwise not.
		if(a>b)
		{
			System.out.println("A is Greater than B");
		}
		if(a<b)
		{
			System.out.println("B is Greater than A");
		}

	}

}
