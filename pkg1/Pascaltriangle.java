package pkg1;

import java.util.Scanner;

public class Pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a pascal number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			int c=1;
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c=c*(i-j)/j;
				
				
			}
			
			System.out.println();
		}

	}

}
