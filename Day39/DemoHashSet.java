package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet
{

	public static void main(String[] args) 
	{
		Set cities=new HashSet<String>();
		cities.add("Latur");
		cities.add("Pune");
		cities.add("Nagpur");
		cities.add("Mumbai");
		cities.add("Latur");
		Iterator it=cities.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
