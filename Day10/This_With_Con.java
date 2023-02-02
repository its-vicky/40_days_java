package fiftydayscode_this;

public class This_With_Con 
{

		int a;
		int b;
		String c;
		public This_With_Con(int a,int b,String c)
		{
			this.a=a;
			this.b=b;
			this.c=c;
		}
		public void Print()
		{
			System.out.println("The Given Statements are ready to follow the This keywords..!!");
			System.out.println(a+" "+b+" "+" "+c);
		}
	public static void main(String[] args) 
	{
		
		This_With_Con twc=new This_With_Con(5, 500, "Sandip");
		This_With_Con twc1=new This_With_Con(10, 1000, "Sandip_Maheshwari");
		twc.Print();
		twc1.Print();

	}

}
