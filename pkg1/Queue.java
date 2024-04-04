package pkg1;

public class Queue {
	
	int arr[];
	int rear=-1;
	int size;
	
	
	public boolean isEmpty() {
		return rear==-1;
	}
	
	public void Add(int data) {
		if(rear==size-1) {
			System.out.println("queue is full");
			}
		rear++;
		arr[rear]=data;
	}
	
	public int remove() {
		if(rear==-1) {
			System.out.println("queue is empty");
			return -1;
		}
		
		int front=arr[0];
		for(int i=0;i<rear;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
		return front;
	}
	
	public int peek() {
		if(rear==-1) {
			System.out.println("queue is empty");
			return -1;
		}
		return arr[0];
	}
	
	public void displayAll() {
		if(rear==-1) {
		System.out.println("queue is empty");
			
		}
		for(int i=0;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	Queue(int n){
		this.arr=new int[n];
		this.size=n;
		
	}

	

	

}
