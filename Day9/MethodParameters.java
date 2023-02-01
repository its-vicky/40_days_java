package fiftydayscode_methods_parameters;

public class MethodParameters
{
	public void add(int a,int b) 
  {
		System.out.println("The Addition is "+(a+b));
	}
	public void sub(int a,int b) 
  {
		System.out.println("The Subtraction is "+(a-b));
	}
	public void multi(int a,int b)
  {
		System.out.println("The Multiplication is "+(a*b));
	}
	public void div(int a,int b) 
  {
		System.out.println("The Division is "+(a/b));
	}
	public void modDiv(int a,int b) 
  {
		System.out.println("The Mod Division is "+(a%b));
	}

	public static void main(String[] args)
  {
		
		MethodParameters mp=new MethodParameters();
		mp.add(20, 25);
		mp.sub(50,40);
		mp.multi(30, 15);
		mp.div(200, 25);
		mp.modDiv(16, 7);
	}

}
