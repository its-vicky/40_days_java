import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the number to check prime : ");
		int a=vc.nextInt();
		int i,m=0,flag=0;
		m=a/2;
		for(i=2;i<=m;i++)
		{
			if(a%i==0)
			{
				System.out.println(" Number is not Prime..!!");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is Prime..!!");
		}
	}
}
