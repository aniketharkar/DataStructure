package pkg2;

import java.util.ArrayList;

public class Usinghashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmaps<String,Integer> map=new Hashmaps<>();
		map.put("india", 120);
		map.put("china",190);
		map.put("usa",50);
		
		System.out.println(map.getkey("india"));
		
		ArrayList<String> keys=map.keyset();
		for(String s:keys) {
			System.out.print(s+" " +map.getkey(s));
			System.out.println();
		}
//		System.out.println();

	}

}
