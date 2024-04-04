package pkg2;

public class stack {
	int capacity=5;
	int arr[] = new int[capacity];
	
	int size=capacity;
	int top=0;
	
	public void push(int data) {
		if(top>=arr.length) {
		  expand();  	
		}
		arr[top]=data;
		top++;
	}
	
	public int pop(){
		if(top==0) {
			System.out.println("stack is empty");
		}
		if(top<(arr.length/2)/2) {
			shrink();
		}
		top--;
		int data = arr[top];
		arr[top]=0;
		return data;
	}
	
	public int peek() {
		if(top==0) {
			System.out.println("stack is empty");
			return -1;
		}
		return arr[top-1];
	}
	public boolean isEmpty() {
		return top==0;
	}
	
	public void displayall() {
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public void expand() {
		int length=top;
		int newarr[]=new int[capacity*2];
		System.arraycopy(arr,0, newarr,0, length);
		arr=newarr;
	}
	
	public void shrink() {
	    int newCapacity = capacity / 2;
	    int length = top;
	    int newarr[] = new int[newCapacity];
	    System.arraycopy(arr, 0, newarr, 0, length);
	    arr = newarr;
	    capacity = newCapacity; // Update the capacity
	}

	
}
