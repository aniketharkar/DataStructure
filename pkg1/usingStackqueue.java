package pkg1;

public class usingStackqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collQueue ap=new collQueue();
		ap.Add(1);
		ap.Add(2);
		ap.Add(3);
		ap.Add(4);
		ap.Add(5);
		ap.Add(6);
		
		while(!ap.isEmpty()) {
			System.out.println(ap.peek());
			ap.remove();
		}

	}

}
