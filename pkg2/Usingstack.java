package pkg2;

public class Usingstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s=new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		
		s.displayall();
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println();
		s.displayall();
		System.out.println(s.peek());

	}

}
