package test;

import java.util.HashMap;
import java.util.Map;

public class hmDemo 
{
	public static void main(String[] args) {
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		
		hm.put("aa", 11);
		hm.put("bb", 22);
		hm.put("cc", 11);
		hm.put("dd", 33);
		Map<Integer,String> newHm=new HashMap<Integer,String>();
		
		
		
		for(Map.Entry<String, Integer> e: hm.entrySet())
		{
			
			
			if(newHm.containsKey(e.getValue()))
			{
				newHm.put(e.getValue(), e.getKey());
			}else
			{
				newHm.put(e.getValue(), e.getKey());
			}
			
		}
		
		
		for(Map.Entry<Integer, String> ee: newHm.entrySet())
		{
			System.out.println(ee.getKey()+"="+ee.getValue());
		}
	}
}
