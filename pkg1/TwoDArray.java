package pkg1;
import java.util.*;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] matrix=new int[4][4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println(matrix.length);
		
      for(int i=0;i<matrix.length;i++) {
    	  for(int j=0;j<matrix[0].length;j++) {
    		  matrix[i][j]=sc.nextInt();
    	  }
      }
      
      System.out.println("here is your matrix");
      
      for(int i=0;i<matrix.length;i++) {
    	  for(int j=0;j<matrix[0].length;j++) {
    		 System.out.print(matrix[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
      System.out.println("here is your transpose of a matrix");
      
//      
//      int rowstart=0;
//      int rowend=matrix.length-1;
//      int colstart=0;
//      int colend=matrix[0].length-1;
//      
//        while(rowstart<rowend && colstart<colend) {
//        	
//        	//traversing first row
//        	for(int col=colstart;col<=colend;col++) {
//        		System.out.print(matrix[rowstart][col]+" ");
//        	}
//        	rowstart++;
//        	
//        	//traversing column end   //4
//        	for(int row=rowstart;row<=rowend;row++) {
//        		System.out.print(matrix[row][colend]+" ");
//        	}
//        	colend--;
//        	
//        	//traversing end row 
//        	
//        	for(int col=colend;col>=colstart;col--) {
//        		System.out.print(matrix[rowend][col]+" ");
//        	}
//        	rowend--;
//        	
//        	//traversing starting column
//        	for(int row=rowend;row>=rowstart;row--) {
//        		System.out.print(matrix[row][colstart]+" ");
//        	}
//        	colstart++;
//        }
//        
//        System.out.println("Thank you visit again");
//      
//      
//   
      for(int i=0;i<matrix.length;i++) {
    	  for(int j=0;j<matrix[0].length;j++) {
    		 System.out.print(matrix[j][i]+" ");
    	  }
    	  System.out.println();
      }
      
      
      
	}

}
