package pkg1;

public class Stack {
	Nodes head;
	static int size;
	Stack(){
		this.head=null;
		this.size=0;
	}
	
	public void push(int data) {
		Nodes newnod=new Nodes(data);
		size++;
		if(head==null) {
			head=newnod;
		}
		newnod.next=head;
		head=newnod;
	}
	public int pop() {
		if(head==null) {
			return -1;
		}
		size--;
		Nodes newnod=head;
		head=head.next;
		return newnod.data;
	}
	
	public int peek() {
		if(head==null) {
			return -1;
		}
		return head.data;
	}
	public boolean isEmpty() {
		return head==null;
	}

}
