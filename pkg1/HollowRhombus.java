package pkg1;

public class HollowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       
       for(int i=1;i<=n;i++) {
    	   
    	   for(int j=1;j<=n-i;j++) {
    		   System.out.print(" ");
    	   }
    	   
    	   for(int j=1;j<=n;j++) {
    		   if(i==1||j==1||i==5||j==5) {
    			   System.out.print("*");
    		   }else {
    			   System.out.print(" ");
    		   }
    		   
    		   
//    	 System.out.println();
    	   }
    	   System.out.println();
       }
	}

}
