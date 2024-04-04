package pkg1;
import java.util.ArrayList;

public class Stackusingarrlist {
	ArrayList<Integer> list=new ArrayList<>();
	
	public boolean isEmpty() {
		return list.size()==0;
	}
	
	public void push(int data) {
		list.add(data);
	}
	
	public int pop() {
		if(list.size()==0) {
			return -1;
		}
		int a=list.get(list.size()-1);
		list.remove(list.size()-1);
		return a;
	}
	
	public int peek() {
		if(list.size()==0) {
			return -1;
		}
		return list.get(list.size()-1);
	}

}
