package pkg1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the size of array ");
//		int size=sc.nextInt();
//		
//		String names[]=new String[size];
//		int enter=sc.nextInt();
//		
//		
//		for(int i=0;i<names.length;i++) {
//			
//			System.out.println("Enter name"+i);
//			names[i]=sc.next();
//		}
//	
//		for(int i=0;i<names.length;i++) {
//			System.out.print(names[i]+",");
//		}
//		
//	Scanner sc=new Scanner(System.in);
//	
//	int number[]=new int[10];
//	System.out.println("enter numbers");
//	for(int i=0;i< number.length;i++) {
//		number[i]=sc.nextInt();
//	}
//	int max=number[0];
//	int min=number[0];
//	
//	for(int i=0;i<number.length;i++) {
//		if(number[i]<min) {
//			min=number[i];
//		}
//		else if(number[i]>max) {
//			max=number[i];
//		}
//	}
//	
//	System.out.println("max value is "+max);
//	System.out.println("min value is "+min);
//	
//	
		
		int nums[]= {1,2,3,7,5,6};
		
		boolean isAsc=true;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]>nums[i+1]) 
				isAsc=false;
		
			}
		if(isAsc)
		    System.out.println("array is sorted");
		else
			System.out.println("array is not sorted");
		}

	}


