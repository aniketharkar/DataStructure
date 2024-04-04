package pkg1;

public class circularqueue {
    int arr[];
    int size;
    int rear=-1;
    int front=-1;
 
    public boolean isEmpty() {
    	return rear==-1 || front==-1 ;
    	
    }
    
    public boolean isFull() {
    	return (rear+1)%size==front;
    }
    
    public void Add(int data) {
    	if(isFull()) {
    		System.out.println("queue is full");
    		return;
    	}
    	if(front==-1) {
    		front=0;
    	}
    	rear=(rear+1)%size;
    	arr[rear]=data;
      }
    
    public int remove() {
    	if(isEmpty()) {
    		System.out.println("queue is empty");
    	}
    	int data = arr[front];
    
//    	If front is equal to rear 
//    	and we want to remove the last element in the queue 
    	if(front==rear) {
    		front=rear=-1;
    	}
    	else {
    	front = (front+1)%size;
    }
    	return data;
    }
    
    public int peek() {
    	if(isEmpty()) {
    		System.out.println("queue is empty");
    		return -1;
    	}
    	return arr[front];
    	}
    
    public void displayall() {
    	if(isEmpty()) {
    		System.out.println("queue is empty");
    		
    	}
    	int i=front;
    	while(i!=rear) {
    		System.out.print(arr[i]+" ");
    		i=(i+1)%size;
    		}
    	System.out.print(arr[i]+" ");
    }
    
    circularqueue(int n){
    	this.arr=new int[n];
    	this.size=n;
    }
}
