package pkg2;

public class Countways {
	static int counts=0;
	public static int count(int n) {
		if(n==2) {
			return 2;
		}
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		//single pair
		int onecall=count(n-1);
		//pairs
		int twopaircall=count(n-2);
		
		return onecall+twopaircall;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		count(n);
		System.out.println(count(n));

	}

}
