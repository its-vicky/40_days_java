package Project1;
import java.util.Scanner;
public class Project1 {
	public static void main(String[] args) {
		System.out.println("Employee InFO !!!!");
		System.out.println("\n");
		// TODO Auto-generated method stub
		System.out.println("EmpNo\tEmp Name\tJoin Date\tDesign.Code\tDepartment\tBasic\tHRA\tIT");
		int Number[]= {1001,1002,1003,1004,1005,1006,1007};
		String array[]= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String date[]= {"01/04/2009","23/08/2012","	12/11/2008","29/01/2013","16/07/2005","	1/1/2000","12/06/2006"};
		String code[]= {"e","c","k","r","m","e","c"};
		String depart[]= {"R&D","PM","Acct","Fronk","Engg","Manu.","PM"};
		int basic[]= {20000,30000,10000,12000,50000,23000,29000};
		int hra[]= {8000,12000,8000,6000,20000,9000,12000};
		int it[]= {3000,9000,1000,2000,20000,4400,1000};
		for(int count=0;count<Number.length;count++) {
			System.out.println(Number[count]+"\t"+array[count]+"  \t"+date[count]+"\t"+code[count]+"	\t"+depart[count]+"	\t"+basic[count]+"\t"+hra[count]+"\t"+it[count]);
		}
		System.out.println("\n");
		System.out.println("Dearness Allowance !!");
		System.out.println("\n");
		System.out.println("Design.code\tDesignation\t	DA");
		String dca[]= {"e","c","k","r","m","",""};
		String dsa[]= {"Engineer","Consultant","Clerk	","Receptionist","Manager	","",""};
		int da[]= {20000,32000,12000,15000,40000,0,0,};
		for(int cin=0;cin<da.length;cin++)
		{
			System.out.println(dca[cin]+"	\t"+dsa[cin]+"	\t"+da[cin]);
		}
		while(true)
		{
		Scanner vc =new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Please Enter the Employee Id !!");
		int EmpNo=0;
			 EmpNo=vc.nextInt();
			 
		switch(EmpNo)
		{
		case 1001:	System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\t 	Salary");
					System.out.println(Number[0]+"\t"+array[0]+"	\t"+depart[0]+"	\t"+dsa[0]+"	\t"+(basic[0]+hra[0]+da[0]-it[0]));break;
		case 1002:	System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\t		 Salary");
					System.out.println(Number[1]+"\t"+array[1]+"	\t"+depart[1]+"	\t"+dsa[1]+"	\t"+(basic[1]+hra[1]+da[1]-it[1]));break;
		case 1003:	System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\t 	Salary");
					System.out.println(Number[2]+"\t"+array[2]+"	\t"+depart[2]+"	\t"+dsa[2]+" \t"+(basic[2]+hra[2]+da[2]-it[2]));break;
		case 1004:	System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\t		Salary");
					System.out.println(Number[3]+"\t"+array[3]+"	\t"+depart[3]+"	\t"+dsa[3]+"	\t"+(basic[3]+hra[3]+da[3]-it[3]));break;
		case 1005:	System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\t 	Salary");
					System.out.println(Number[4]+"\t"+array[4]+"	\t"+depart[4]+"	\t"+dsa[4]+"	\t"+(basic[4]+hra[4]+da[4]-it[4]));break;
		case 1006:	System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\t	Salary");
					System.out.println(Number[5]+"\t"+array[5]+"	\t"+depart[5]+"	\t"+dsa[0]+"	\t"+(basic[5]+hra[5]+da[5]-it[5]));break;
		case 1007:	System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\t	Salary");
					System.out.println(Number[6]+"\t"+array[6]+"	\t"+depart[6]+"	\t"+dsa[1]+"	\t"+(basic[6]+hra[6]+da[6]-it[6]));break;
		default:System.out.println("There is not Employee with empid ="+EmpNo);
		
		}
		}
	}
	}
