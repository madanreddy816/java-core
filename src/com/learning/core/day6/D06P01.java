package com.learning.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class D06P01 
{
	public static void main(String[]args)
	{
		Map<String,Long> hm=new HashMap<String,Long>();
		hm.put("Amal",(long) 998787823);
		hm.put("Manvitha",937843978l);
		hm.put("Joseph",7882221113l);
		hm.put("Smith",8293893311l);
		hm.put("Kathe",7234560011l);
		Set<Entry<String, Long>> en=hm.entrySet();
		for(Entry<String, Long> e:en)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
	}
}
