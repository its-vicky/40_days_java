package fiftydayscode_polymorphism;

class One
{
	//the method overriding contains same methodname, same parameters but accessed in a different class
	//the access to the method then we want to create their seprate object.
	void square(double a)
	{
		System.out.println("[ONE] The Square is "+(a*a));
	}
	void cube(double a)
	{
		System.out.println("[ONE] The Cube is "+(a*a*a));
	}
}
class Two extends One
{
	void square(double a)
	{
		System.out.println("[TWO] The Square is "+(a*a));
	}
	void cube(double a)
	{
		System.out.println("[TWO] The Cube is "+(a*a*a));
	}
}
public class Method_Overriding {

	public static void main(String[] args) {
		System.out.println("METHOD OVERRIDING");
		System.out.println("================================");
		One o=new One();
		o.square(10);
		o.cube(10);
		Two t=new Two();
		t.square(5);
		t.cube(5);

	}

}
