package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashMap 
{

	public static void main(String[] args) 
	{
			Map<String,Double> map=new HashMap<String, Double>();
			map.put("Vikas", 96.50);
			map.put("Aditya", 95.50);
			map.put("Suraj", 94.50);
			map.put("Mahesh", 93.50);
			
			Set set=map.entrySet();
			Iterator it=set.iterator();
			while(it.hasNext())
			{
				Map.Entry entry=(Map.Entry)it.next();
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
	}

}
