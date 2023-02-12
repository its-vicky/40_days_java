import java.io.FileInputStream; 
public class FileInputStreamExam
 { 
	 public static void main(String args[])
 	{ 
		 try 
		 { 
			 FileInputStream fin=new FileInputStream("D:\\testout2.txt"); 
 			int i=fin.read(); 
 			System.out.print((char)i); 
			 fin.close(); 
 			}
 			catch(Exception e)
			 {
				 System.out.println(e);
			 } 
 	} 
 } 
