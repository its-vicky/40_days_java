package fiftydayscode_accessSpecifiers;
class A
	{
		private int data=40;
		private void msg()
		{
			System.out.println("Hellojava");
		}
	}
public class PrivateExample {

	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.data);//CompileTimeError
		obj.msg();
	}

}
