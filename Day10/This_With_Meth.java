package fiftydayscode_this;

public class This_With_Meth 
{

		public void add()
		{
			System.out.println("The First Statement..!!");
		}
		public void sub()
		{
			System.out.println("The Second Statement..!!");
		}
		public void multi()
		{
			System.out.println("The Third Statement..!!");
			this.add();
			this.sub();
		}
	public static void main(String[] args) 
	{
		This_With_Meth twm=new This_With_Meth();
		twm.multi();

	}

}
