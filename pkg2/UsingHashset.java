package pkg2;
import java.util.HashSet;
import java.util.Iterator;

public class UsingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(1);
		hs.add(4);
		System.out.println(hs);
		
		hs.remove(1);
		System.out.println(hs.contains(1));
		
		System.out.println(hs.size());
		Iterator i=hs.iterator();
		
//		while(i.hasNext()) {
//			System.out.print(i.next()+" ");
//		}
//		
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		

	}

}
