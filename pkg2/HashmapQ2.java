package pkg2;
import java.util.*;

public class HashmapQ2 {
	public static String getstart(HashMap<String,String> map) {
		HashMap<String,String> revmap=new HashMap<>();
		for(String key:map.keySet()) {
			revmap.put(map.get(key), key);
		}
		System.out.println(revmap);
		
		for(String key:map.keySet()) {
			if(!revmap.containsKey(key)) {
				return key;
			}
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<>();
		map.put("chennai","Bengul");
		map.put("Mumbai","delhi");
		map.put("goa","chennai");
		map.put("delhi","goa");
	     System.out.println(map);
	     
	    String start= getstart(map);
          
	   while(map.containsKey(start)) {
		   System.out.print(start+"->");
		   start=map.get(start);
	   }
	   System.out.println(start);
	}

}
