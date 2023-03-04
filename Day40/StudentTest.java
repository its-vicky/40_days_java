package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<Student>();
		int i=1;
		System.out.println("----ARRAY LIST----");
		Scanner vc=new Scanner(System.in);
		while(i<=3)
		{
			System.out.print("Enter Roll No : ");
			int rno=vc.nextInt();
			System.out.print("Enter Name : ");
			String sname=vc.next();
			System.out.print("Enter Address : ");
			String saddress=vc.next();
			System.out.println("=========================");
			Student s=new Student(rno,sname,saddress);
			slist.add(s);
			i++;
		}
		Iterator list=slist.iterator();
		System.out.println("=-= OUTPUT =-=");
		System.out.println("==============");
		while(list.hasNext())
		{
			Student s=(Student)list.next();
			System.out.println(s.getRno()+"\t"+s.getSname()+"\t"+s.getSaddress());
		}

	}
}
