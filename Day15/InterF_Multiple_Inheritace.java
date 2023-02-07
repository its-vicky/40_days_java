package fiftydayscode_interfaces;

interface Demo
{
	void print();
}
class Railway implements Demo
{
	public void print()
	{
		System.out.println("The Indian Railways are famous in whole World..!!");
	}
}
class Buses implements Demo
{
	public void print()
	{
		System.out.println("The Shivshahi Buses are famous in whole India..!!");
	}
}
public class InterF_Multiple_Inheritace {

	public static void main(String[] args) {
		Buses bs=new Buses();
		bs.print();

	}

}
