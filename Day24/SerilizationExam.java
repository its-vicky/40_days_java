package fiftydayscode_Seri_Desi;
import java.io.*;
class Exam implements Serializable
{
	String name;
	 int id;
	 Exam(String n, int i)
	 {
	 name = n;
	 id = i;
	 }
}
public class SerilizationExam 
{
	public static void  main(String args[])
	{
		try
		 {
			Exam ex = new Exam("Abcd", 104);
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(ex);
			// oos.flush();
			os.close();
		 }
		 catch (Exception e)
		 {
			 System.out.println(e);
		 }
	}
	 
}
