package fiftydayscode_abstract;

abstract class Honda4
{
		abstract void run();
}
class AbstractClass_Method extends Honda4 
{
		void run()
		{
			System.out.println("running safely");
		}
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Honda4 obj=new AbstractClass_Method();
			obj.run();
		}
}
