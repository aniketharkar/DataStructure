package pkg1;

public class usingLinkedlistQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlistQueue ap=new linkedlistQueue();
		ap.Add(1);
		ap.Add(2);
		ap.Add(3);
		ap.Add(4);
		ap.Add(5);
		ap.Add(6);
		
		ap.remove();
		ap.remove();
		ap.remove();
		ap.remove();
		
		ap.Add(7);
		ap.Add(8);
		ap.Add(9);
		ap.Add(10);
		
		ap.displayall();
		System.out.println();
		boolean empty=ap.isEmpty();
		System.out.println(empty);
		
		System.out.println(ap.peek().data);
		
		ap.remove();
		ap.remove();
		ap.remove();
		ap.remove();
		ap.remove();
		ap.remove();
		System.out.print(ap.remove().data);
		
		

	}

}
