package pkg2;
import java.util.ArrayList;

public class UsingBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[]= {5,6,7,8,9,2,1,3};
		Binaryseartree bst=new Binaryseartree();
		Node root=null;
		for(int i:val) {
			root=bst.insert(root, i);
		}
		
//		bst.inorder(root);
//		System.out.println();
//		
//		bst.delete(root, 6);
//		bst.inorder(root);
//		System.out.println();
//		
//		bst.delete(root, 3);
//		bst.inorder(root);
//		System.out.println();
//		
//		System.out.println(bst.find(root, 5));
		bst.inorder(root);
		System.out.println();
          bst.Printinrange(root, 3, 8);
          System.out.println();
        ArrayList<Integer> arr=new ArrayList<>();  
         bst.Path(root, arr); 
	}

}
