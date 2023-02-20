package fiftydayscode_practice_day2;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter the number for reverse : ");
		int no=vc.nextInt();
		int rev=0,r,a;
		a=no;
		while(no>0)
		{
			r=no%10;
			rev=rev*10+r;
			no=no/10;
		}
		System.out.println("The given number is reverse format : "+rev);
	}

}
