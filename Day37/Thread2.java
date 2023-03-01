package com.synchronize;

public class Thread2 extends Thread{
	Table t;
	public Thread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10); 
	}
}
