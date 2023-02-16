package fiftydayscode_Seri_Desi;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;
class Studentinfo implements Serializable
{
	String name;
	int id;
	Studentinfo(String n, int i)
	{
		this.name = n;
		this.id = i;
	}
}

public class DeserilizationExam 
{
	public static void main(String args[])
	{
		Studentinfo si=null ;
		 try
		 {
			 FileInputStream fis = new FileInputStream("d:\\student2.txt");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 si = (Studentinfo)ois.readObject();
		 }
		 catch (Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println(si.name);
		 System.out. println(si.id);
	}

}

