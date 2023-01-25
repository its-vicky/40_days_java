package fiftydayscode;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args)
	{
		/*The User input in the Java programming*/
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the Byte Value ");
		byte a=vc.nextByte();

		System.out.print("Enter the Int Value ");
		int b=vc.nextInt();

		System.out.print("Enter the Float Value ");
		float c=vc.nextFloat();

		System.out.print("Enter the Double Value ");
		double d=vc.nextDouble();

		System.out.print("Enter the Boolean Value ");
		boolean e=vc.nextBoolean();

		System.out.print("Enter the String Value ");
		String f=vc.next();
		
		System.out.println("The Byte Input: "+a);
		System.out.println("The Integer Input: "+b);
		System.out.println("The Float Input: "+c);
		System.out.println("The Double Input: "+d);
		System.out.println("The Boolean Input: "+e);
		System.out.println("The String Input: "+f);
	}

}
