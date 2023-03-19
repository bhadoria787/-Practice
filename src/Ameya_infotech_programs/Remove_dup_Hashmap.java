package Ameya_infotech_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Remove_dup_Hashmap {

	public static void main(String[] args) {

		Map<String,String> map=new HashMap();  
		map.put("1","Amit");  
		map.put("5","Rahul");  
		map.put("2","Jai");  
		map.put("6","Amit");  
		System.out.println(map);
		for(String s: new ConcurrentHashMap<>(map).keySet())
		{
			String value=map.get(s);
			for(Map.Entry<String, String> ss:new ConcurrentHashMap<>(map).entrySet())
			{
				if(s!=ss.getKey()&&value==ss.getValue())
				{
					map.remove(ss.getKey());
				}
			}
		}
		System.out.println(map);

	}

}
