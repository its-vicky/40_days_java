import java.util.Scanner;
class LargeSmall
{
	public static void main(String args[])
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int a=vc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=vc.nextInt();
		}
		System.out.print("The array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int small=arr[0];
		int large=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
			else if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println("The Largest Number in Series is "+large);
		System.out.println("The Smallest Number in Series is "+small);
	}
}
