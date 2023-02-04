package fiftydayscode_polymorphism;

public class Method_Overloading 
{

		//the overloading method contains same method name but different parameters
	public void add()
	{
		System.out.println("The Start Method Overloading");
	}
	public void add(int a,int b)
	{
		System.out.println("The Addition of the Given Number is "+(a+b));
	}
	public void add(int a)
	{
		System.out.println("The Square of the Given number is "+(a*a));
	}
	public void add(double a, double b, double c)
	{
		System.out.println("The Given Float addition is "+(a+b+c));
	}
	public void add(double a, double b)
	{
		System.out.println("The Given Double addition is "+(a+b));
	}
	public static void main(String[] args)
	{
		System.out.println("METHOD OVERLOADING");
		System.out.println("===========================");
		Method_Overloading mo=new Method_Overloading();
		mo.add();
		mo.add(40, 50);
		mo.add(40.60, 38.6, 50.6);
		mo.add(49.2, 1.2);
		mo.add(5);

	}

}
