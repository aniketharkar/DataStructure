package pkg1;

public class usingBinarytree {

	public static void main(String[] args) {
		int arr[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree ap=new BinaryTree();
		Node root=ap.buildbinaryTree(arr);
//		ap.preorder(root);
		//ap.Inorder(root);
//		ap.Postorder(root);
//		ap.Levelorder(root);
		int count=ap.CountNodes(root);
//		System.out.println(count);
//		int sum=ap.SumofNodes(root);
//		System.out.println(sum);
//		int height=ap.heightoftree(root);
//		System.out.println(height);
//        int diameter=ap.longestdiameter(root);
//        System.out.println(diameter);
		
		Treeinfo mytree=ap.diameter2(root);
		System.out.println(mytree.ht);
		System.out.println(mytree.dia);
	}

}
