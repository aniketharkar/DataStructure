package pkg1;

public class Linkedlist {
	
	Nodes head;
	static int size;
	
	//creating an object to add and remove the nodes
	public void Addfirst(int data) {
	  Nodes newnode=new Nodes(data);
	  if(head==null) {
		  head=newnode;
		  return;
	  }
	  newnode.next=head;
	  head=newnode;
	  }
	
	public void Addlast(int data) {
		Nodes newnode=new Nodes(data);
		
		if(head==null) {
			head=newnode;
			return;
		}
		
		Nodes last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newnode;
	}
	
	public void Addbetween(int data,int index) {
		Nodes newnode=new Nodes(data);
		if(head==null||index==0) {
			newnode.next=head;
			head=newnode;
			return;
		}
		Nodes currnode=head;
		for(int i=1;i<size;i++) {
			if(i==index) {
				Nodes nextn=currnode.next;
				currnode.next=newnode;
				newnode.next=nextn;
			}
			currnode=currnode.next;
		}
	}
	
	public void removefirst() {
		if(head==null) {
			return;
		}
		size--;
		head=head.next;
	}
	public void removelast() {
		if(head==null) {
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Nodes secondlast=head;
		while(secondlast.next.next!=null) {
			secondlast=secondlast.next;
		}
		secondlast.next=null;
		
	}
	
	public void removeAtindex(int idx) {
		if(idx==0) {
			head=head.next;
			return;
		}
		Nodes nod=head;
		for(int i=1;i<size;i++) {
			if(i==idx) {
			break;	
			}
			nod=nod.next;
		}
		nod.next=nod.next.next;
		size--;
	}
	
	public int size() {
		return this.size;
	}
	
	public void displayall() {
		Nodes currnode=head;
		while(currnode!=null) {
			System.out.print(currnode.data+" ");
			currnode=currnode.next;
		}
	}
	
	public void rec() {
		head=recurcive(head);
		
	}
	
	public void reverseNode() {
		Nodes prevnode=head;
		Nodes currnode=head.next;
		
		while(currnode!=null) {
			Nodes nextnode=currnode.next;
			currnode.next=prevnode;
			
			prevnode=currnode;
			currnode=nextnode;
		}
		head.next=null;
		head=prevnode;
		
	}
	public Nodes recurcive(Nodes head) {
		if(head==null||head.next==null) {
			return head;
		}
		Nodes newHead=recurcive(head.next);
		
		head.next.next=head;
		head.next=null;
		
		
		return newHead;
	}
	
	
	Linkedlist(){
		this.head=null;
		
	}

}
