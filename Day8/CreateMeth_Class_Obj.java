package fiftydayscode_method_class_object;

public class CreateMeth_Class_Obj {
		int a=40;			//this is the instance variable..!!
		static int b=45;	//this is the static variable..!!
		void firstMethod()	//the method was created..!!
		{
			int c=50;		//this is the local variable..!!
			System.out.println("the First Statement is Printed..!!"+c);
		}

	public static void main(String[] args) 	//this is the main method..!!
	{	
		
		System.out.println("This is the main method..!!");	
		CreateMeth_Class_Obj obj=new CreateMeth_Class_Obj();	//The obj name object is created..!!
		System.out.println(obj.a);	//the instance variable is accessed through object
		System.out.println(b);		//the static variable doesn't want to create variable..!!
		obj.firstMethod();		// the main method above is accessed through object..!!
			

	}

}
