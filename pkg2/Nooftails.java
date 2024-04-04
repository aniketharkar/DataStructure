package pkg2;

public class Nooftails {
	static int count=0;
	public static void counttails(int n,int m) {
		if(n==m) {
			count+=2;
			return;
		}
		if(n<m) {
			count++;
			return;
		}
		counttails(n-1,m);
		counttails(n-m,m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=4;
       int m=2;
       counttails(n,m);
       System.out.println(count);
	}

}
