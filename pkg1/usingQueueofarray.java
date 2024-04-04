package pkg1;

public class usingQueueofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue ap=new Queue(6);
		ap.Add(1);
		ap.Add(2);
		ap.Add(3);
		ap.Add(4);
		ap.Add(5);
		ap.Add(6);
		
		ap.remove();
		ap.remove();
		
	    ap.displayAll();
	    System.out.println();
	    
	    
	    while(!ap.isEmpty()) {
	    	System.out.print(ap.peek()+" ");
	    	ap.remove();
	    	
	    }
	}

}
