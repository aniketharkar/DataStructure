package pkg2;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"aniket");
		map.put(2,"aman");
		map.put(3,"namita");
		map.put(4,"anupan");
		map.put(5,"bhai ya tu kya kar raha hai,abhi ma tera dogalapan utara ta hu");
		map.put(6,"lenskart");
//		map.put(5,"oyo");
		System.out.println(map);
		
		map.remove(3);
		System.out.println(map);
		System.out.println(map.containsKey(1));
		System.out.println(map.get(1));
		
		Set<Integer> keys=map.keySet();
		for(int i:keys) {
			System.out.print(map.get(i)+" ");
			
		}
		
		for(Map.Entry<Integer,String> e:map.entrySet()) {
			System.out.print(e.getKey()+" ");
			System.out.print(e.getValue());
			System.out.println();
		}
		
		Map.Entry<Integer,String> e=(Entry<Integer, String>) map.entrySet();
		System.out.println(e.getValue());
		System.out.println(e.getValue());
		
		
		

	}

}
