import java.util.Scanner;
class PalidromeNumber
{
	public static void main(String args[])
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the number to check the palidrome : ");
		int n=vc.nextInt();
		int r, sum=0,temp;
		temp=n;
		while(n>0)
		{
			r = n%10;
			sum = (sum * 10)+r;
			n = n/10;
		}
		if(temp==sum)
		{
			System.out.println("The given number is Palidrome..!!");
		}
		else
		{
			System.out.println("The given number is Not Palidrome..!!");
		}
	}
}		
