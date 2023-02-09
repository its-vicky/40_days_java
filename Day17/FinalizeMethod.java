package fiftydayscode_finalize;

class Demo
{
	int a;
	public Demo()
	{
		a=10;
	}
	void show()
	{
		System.out.println("The Square of the Given Number is "+(a*a));
	}
	public void finalize() throws Throwable
	{
		System.out.println("From Finalize Method");
	}
}
public class FinalizeMethod {

	public static void main(String[] args) {
		Demo a1=new Demo();
		Demo a2=new Demo();
		a1=a2;
		a1.show();
		Runtime.getRuntime().runFinalization();;
		System.gc();
		System.out.println("The Task Has Been Completed..!!");

	}

}
