package pkg1;

public class InveretedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=2;j<=i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=n-i+1;k++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}

	}

}
