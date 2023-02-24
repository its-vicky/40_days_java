import java.util.Scanner;
class Pattern1
{
	public static void main(String args[])
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the number you want to create pattern : ");
		int a=vc.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
