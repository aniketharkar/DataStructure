package pkg1;

public class usingCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circularqueue ap=new circularqueue(6);
		ap.Add(1);
		ap.Add(2);
		ap.Add(3);
		ap.Add(4);
		ap.Add(5);
		ap.Add(6);
		
		ap.remove();
		ap.remove();
		ap.remove();
		
		System.out.println(ap.peek());
		
		ap.Add(7);
		ap.Add(8);
		ap.Add(9);
		
		ap.remove();
		ap.remove();
		ap.remove();
		
		ap.Add(10);
		ap.Add(11);
		ap.Add(12);
        ap.displayall();

	}

}
