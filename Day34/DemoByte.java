package com.convert;
import java.util.Scanner;
public class DemoByte 
{

	public static void main(String[] args) 
	{
		Scanner vc=new Scanner(System.in);
		System.out.print("Enter You want to convert number in bytes: ");
		int no=vc.nextInt();
		if(no<255)
		{
			System.out.println(String.format("%8s", Integer.toBinaryString(no)).replaceAll(" ", "0"));
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
