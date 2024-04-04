package pkg1;

public class Halfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=250;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j2=1;j2<=i;j2++) {
				System.out.print(j2+" ");
			}
			System.out.println();
		}

	}

}
