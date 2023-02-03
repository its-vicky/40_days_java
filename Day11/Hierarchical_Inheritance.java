package fiftydayscode_inheritance;
class A1
{
	void run()
	{
		System.out.println("This is the parent class..!!");
	}
}
class B1 extends A1
{
	void run1()
	{
		System.out.println("This is the child class1..!!");
	}
}
class C1 extends A1
{
	void run2()
	{
		System.out.println("This is the child class2..!!");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		System.out.println("HIERARCHICAL INHERITANCE");
		System.out.println("===============================");
		B1 b=new B1();
		b.run();
		b.run1();
		C1 c=new C1();
		c.run();
		c.run2();

	}

}
