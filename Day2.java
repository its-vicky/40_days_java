package fiftydayscode;

public class Day2 {

	public static void main(String[] args) {
		//declaring the datatypes with some values
		System.out.println("============================================");
		System.out.println("Some Basic Datatypes Examples");
		System.out.println("============================================");
		byte a=100;
		short b=7899;
		int c=113454;
		float d=4.87f;
		float d1=87e3f;
		double e=4789.8;
		char f='v';
		boolean g=a>b;
		String h="its_vicky";
		System.out.println("The Byte is "+a);
		System.out.println("The Short is "+b);
		System.out.println("The Int is "+c);
		System.out.println("The Float is "+d);
		System.out.println("The Float Complex is "+d1);
		System.out.println("The Double is "+e);
		System.out.println("The Char is "+f);
		System.out.println("The Boolean is "+g);
		System.out.println();
		System.out.println("============================================");
		System.out.println("Some Basic Arithmatic Operators");
		System.out.println("============================================");
		//taking some basic operations 
		int x=20;
		int y=5;
		int z=x+y;
		int z1=x-y;
		int z2=x*y;
		int z3=x/y;
		int z4=x%y;
		
		System.out.println("The Addition is "+z);
		System.out.println("The Subtraction is "+z1);
		System.out.println("The Multiplication is "+z2);
		System.out.println("The Division is "+z3);
		System.out.println("The Mod Division is "+z4);
		System.out.println();
		System.out.println("============================================");
		System.out.println("Some Basic Uniory Operators");
		System.out.println("============================================");
		int w=10;
		boolean v=true;
		System.out.println(w++);
		System.out.println(++w);
		System.out.println(w--);
		System.out.println(--w);
		System.out.println(~w);
		System.out.println(!v);
		System.out.println();
		System.out.println("============================================");
		System.out.println("Some Basic Left Shift Operators");
		System.out.println("============================================");
		System.out.println(10<<2);
		System.out.println(20<<5);
		System.out.println();
		System.out.println("============================================");
		System.out.println("Some Basic Right Shift Operators");
		System.out.println("============================================");
		System.out.println(10>>2);
		System.out.println(20>>5);

	}

}
