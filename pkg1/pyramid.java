package pkg1;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int n=10;
//		int i;
//		
//        for( i=1;i<=n;i++){
//             
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             
//         for(int j=1;j<=i;j++){
//             System.out.print(i+ " ");
//         }
//         System.out.println();
//         
//         }
		
//		int n = 5;
//		 
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			
//			for(int j=i;j>=1;j--) {
//				System.out.print("* ");
//			}
//			
//			for(int j=2;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//		
//		int n =5;
//		for(int i=1;i<=n;i++) {
//			System.out.print("*");
//			
//			for(int j=3;j<=i;j++) {
//				System.out.print(" ");
//				}
//			
//			System.out.print("*");
//			System.out.println();
//		}
		
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
//				for(int j1=1;j1<=2*(n-i);j1++) {
//					System.out.print(" ");
//				}
//				
				if(j==1||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}

	}

}
