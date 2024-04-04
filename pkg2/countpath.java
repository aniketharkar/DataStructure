package pkg2;

public class countpath {
	static int count=0;
	public static void countpaths(int i,int j,int n,int m) {
		if(i==n-1 && j==m-1) {
			count++;
			return;
		}
		if(i==n||j==m) {
			return;
		}
		countpaths(i,j+1,n,m);
		countpaths(i+1,j,n,m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=3;
		countpaths(0,0,n,m);
		
		System.out.println(count);
		

	}

}
