package Assig002;
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		Scanner vc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int num=vc.nextInt();
		int []arr=new int[num];
		System.out.println("Enter the number in array: ");
		try {
		for(int i=0;i<num;i++)
		{
			arr[i]=vc.nextInt();
			System.out.println(arr[i]);
		}
		System.out.println("Enter the Index :");
		int index=vc.nextInt();
		System.out.println("The Index of "+index+" = "+arr[index-1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is not Found..!!");
		}
		catch(NumberFormatException s)
		{
			System.out.println(s);
		}
	}

}
