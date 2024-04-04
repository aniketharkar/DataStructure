package pkg1;

public class linkedlistQueue {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node front = null;
	Node rear=null;
	
	public boolean isEmpty() {
		return front==null || rear == null;
	}
	
	public void Add(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			front=rear=newNode;
			return;
		}
		rear.next=newNode;
		rear=newNode;
	}
	
	public Node remove() {
		if(isEmpty()) {
			System.out.println("u can't remove, as the queue is empty");
			return new Node(-1);
		}
		Node data=front;
		if(front == rear) {
			front=rear=null;
			return data;
		}
		front=front.next;
		return data;
		}
	
	public Node peek() {
		if(isEmpty()) {
			System.out.println("sorry can't display as the queue is empty");
			return new Node(-1);
		}
		return front;
	}
	
	public void displayall() {
		if(isEmpty()) {
			System.out.println("sorry con't display as the queue is empty");
		   return;
		}
		Node i=front;
		while(i!=null) {
			System.out.print(i.data+" ");
			i=i.next;
		}
		
		
	}
	
	
	

}
