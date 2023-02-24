import java.util.Scanner;
class Pattern2
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
				if((i==1 && j==0)||(i==2 && j==0)||(i==2 && j==1)||(i==3 && j==0)||
				(i==1 && j==4)||(i==2 && j==3)||(i==2 && j==4)||(i==3 && j==4))
				{
					System.out.printgit(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
