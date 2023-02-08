import java.util.Scanner;
class ExceptionHand
{
	public static void main(String args[])
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int a=vc.nextInt();
		System.out.print("Enter the Operator : ");
		String op=vc.next();
		System.out.print("Enter the Second Number : ");
		int b=vc.nextInt();
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
					System.out.println("The Mod Division is "+(a%b));
					break;
				default:
					System.out.println("Invalid Operator..!!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Entry");
		}
		finally
		{
				System.out.println("THIS IS THE CALCULATOR...!!");
		}
	}
}
	
		
