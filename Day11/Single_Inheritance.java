package fiftydayscode_inheritance;
class Demo
{
	void add()
	{
		System.out.println("This is the parent class..!!");
	}
}
public class Single_Inheritance extends Demo
{

	public static void main(String[] args) 
	{
		System.out.println("SINGLE INHERITANCE");
		System.out.println("=======================");
		System.out.println("This is the child class..!!");
		Demo dm=new Demo();
		dm.add();
	}

}
