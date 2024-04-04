package pkg1;

public class Usinglinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist list=new Linkedlist();
		list.Addfirst(1);
		list.Addlast(5);
		System.out.println(list.size);
		list.Addbetween(2, 1);
		list.Addbetween(3, 2);
		list.Addbetween(4, 3);
		
		list.displayall();
		
//		list.removeAtindex(1);
//		list.removeAtindex(1);
//		list.displayall();
		
//		list.reverseNode();
		
//		list.recurcive(list.head);
//		System.out.println();
		list.rec();
		
		list.displayall();
		

	}

}
