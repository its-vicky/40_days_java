package fiftydayscode_this;

public class This_variable 
{

		int a=20;
		public void Square(int a)
		{
			this.a=a;
		}
	public static void main(String[] args) 
	{
		This_variable tv=new This_variable();
		System.out.println("The SQUARE of the number is "+(tv.a*tv.a));

	}

}
