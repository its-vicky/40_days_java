package fiftydayscode_inheritance;
class A
{
	void add(int a,int b)
	{
		System.out.println("The Addition of the given number is "+(a+b));
	}
}

class B extends A
{
	void sub(int a,int b)
	{
		System.out.println("The Subtraction of the given number is "+(a-b));
	}
}

class C extends B
{
	void multi(int a,int b)
	{
		System.out.println("The Multiplication of the given number is "+(a*b));
	}
}

class D extends C
{
	void div(int a,int b)
	{
		System.out.println("The Division of the given number is "+(a/b));
	}
}
public class Multilevel_inheritance 
{

	public static void main(String[] args) 
	{
		System.out.println("MULTILEVEL INHERITANCE");
		System.out.println("=============================");
		D d=new D();
		d.add(20, 5);
		d.sub(50, 40);
		d.multi(5, 60);
		d.div(500, 50);

	}

}
