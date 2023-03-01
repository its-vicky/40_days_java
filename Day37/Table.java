package com.synchronize;

public class Table {
	synchronized public void printTable(int number)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*number);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
			
	}
}
