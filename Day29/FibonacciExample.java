import java.util.Scanner;
class FibonacciExample
{
	public static void main(String args[])
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a=vc.nextInt();
		int n1=0, n2=1, n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<a;++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
