package com.synchronize;

public class Thread1 extends Thread{
	Table t;
	public Thread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
