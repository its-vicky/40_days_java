class StringBufferExample
{
	//the StringBuffer Classes are used for performing some operations on the String
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("India ");
		System.out.println("The StringBuffer capacity : "+sb.capacity());
		System.out.println("The append the string is : "+sb.append("Jay Ho "));
		System.out.println("The string delete is : "+sb.delete(1,3));
		System.out.println("The Reverse String is : "+sb.reverse());
		System.out.println("The Replace the String is : "+sb.replace(1,3, ("Welcome")));
	}
}
