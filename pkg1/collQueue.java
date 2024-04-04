package pkg1;
import java.util.*;

public class collQueue {
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();

	public boolean isEmpty() {
		return s1.isEmpty();
	}
	
	public void Add(int data) {
		if(isEmpty()) {
			s1.push(data);
			return;
		}
		while(!s1.isEmpty()) {
		s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()) {
		s1.push(s2.pop());
		}
	}
	
	public int remove() {
		if(s1.isEmpty()) {
			System.out.println("sorry the queue is empty");
			return -1;
		}
		return s1.pop();
		}
	
	public int peek() {
		if(s1.isEmpty()) {
			System.out.println("sorry the queue is empty");
			return -1;
		}
		
		return s1.peek();
		
	}

		
		
	}


