package pkg1;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist is in heap memory 
		//can increase and decrease the size 
		//array is in stack cannot increase the size 
		//array - access is fast ,arraylist- increase and decrease the size
		
		ArrayList<Integer> list=new ArrayList<>();
		//add,add(location),set(),get,name,size,remove
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		list.set(3,10);
		list.add(3,4);
		list.add(2,12);
		list.add(4,15);
		
		list.;
		
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
