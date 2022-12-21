package test;

import java.util.HashMap;
import java.util.Map;

public class SplitString {

	public static void main(String[] args) {
		
		        String str = "Hi this is Raghavendra and Raghavendra is giving interview";
		        String[] list = str.split("\\s+");
		        for (int i = 0; i < list.length; i++) {
		            System.out.println(list[i]);
		        }
		        
		        Map<String, Integer> hm=new HashMap<String, Integer>();

		        for(String s:list)
		        {
		        if(hm.containsKey(s))
		        {
		        hm.put(s,hm.get(s)+1);
		        }
		        else
		        {
		        hm.put(s,1);
		        }
		    
	}
		        
		        System.out.println(hm);

}
}
