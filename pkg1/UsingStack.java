package pkg1;

public class UsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack s=new Stack();
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(5);
//		
//		System.out.print(s.peek());
		
		Stackusingarrlist s=new Stackusingarrlist();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println(s.peek());
		
		s.pop();
		
		System.out.println(s.peek());

	}

}
