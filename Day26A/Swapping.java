package fiftydayscode_practice_day1;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		Scanner vc=new Scanner(System.in);
		int temp=0;
		System.out.print("Enter A ");
		int a=vc.nextInt();
		System.out.print("Enter B ");
		int b=vc.nextInt();
		if(a>0)
		{
			temp=a;
			a=b;
			b=temp;
			System.out.println("The A is "+a);
			System.out.println("The B is "+b);
		}
	}

}
