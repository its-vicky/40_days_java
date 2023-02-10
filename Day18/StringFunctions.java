package fiftydayscode_stringFunctions;

public class StringFunctions
{ 
	public static void main(String args[])
	 { 
		 String s1="java"; 
		 String s2="program"; 
		 System.out.println("string length is: "+s1.length()); 
		 System.out.println("string length is: "+s2.length()); 
		System.out.println("string charat is: "+s2.charAt(4));
		System.out.println(s1.concat(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase()); 
		int i;
		i= s1.compareTo(s2);
		if(i==0)
		 {
			System.out.println("String are same");
		 }
		else
		{
			System.out.println("String are not same");
		}
	}
}
