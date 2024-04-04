package pkg1;
import java.util.*;
import java.util.Queue;

public class BinaryTree {


	
	int idx=-1;
	public Node buildbinaryTree(int nodes[]) {
		idx++;
		if(idx>=nodes.length) {
			return null;
		}
		if(nodes[idx]==-1) {
			return null;
		}
//		if(idx==nodes.length) {
//			return null;
//		}
		//i will create a node at my level and to create left and right node 
		//i will call recursion for left and right 
		//recursion will create a left and right node for me 
		Node newNode=new Node(nodes[idx]);
		newNode.left=buildbinaryTree(nodes);
		newNode.right=buildbinaryTree(nodes);
		return newNode;
	  }
	
	public void preorder(Node root) {
		if(root==null) {
			return;
		}
		
		System.out.println(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		return;
	}
	
	public void Inorder(Node root) {
		if(root==null) {
			return;
		}
		Inorder(root.left);
		System.out.println(root.data);
		Inorder(root.right);
	}
	public void Postorder(Node root) {
		if(root==null) {
			return;
		}
		Postorder(root.left);
		Postorder(root.right);
		System.out.println(root.data+" ");
		return;
	}
	
	public void Levelorder(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
	//adding root node in a queue and null 
	//then removing the root node and adding its left and right in the queue
	//if in the queue its null then again we will add null
	while(!q.isEmpty()) {
		
		Node CurrNode=q.remove();
		if(CurrNode==null) {
			System.out.println();
		   if(q.isEmpty()) {
			   break;
		   }else {
			q.add(null);
		   }
		}
		else {
		System.out.print(CurrNode.data+" ");
		if(CurrNode.left!=null) {
		q.add(CurrNode.left);
		}
		if(CurrNode.right!=null) {
		q.add(CurrNode.right);
	}
		
	}

   }
 }
	public int CountNodes(Node root) {
		if(root==null) {
			return 0;
		}
		//get the left and right level count and count at my level
		//return the count at my level 
		//next level will do the same return the count at its level 
		//corner condition if root is null return 0
		
		int left =CountNodes(root.left);
		int right=CountNodes(root.right);
		return left+right+1;
	}
	
	public int SumofNodes(Node root) {
		//do at your level i have to get the left sum and right sum and 
		//add with root data and return it 
		if(root==null) {
			return 0;
		}
		int leftsum=SumofNodes(root.left);
		int rightsum=SumofNodes(root.right);
		return rightsum+leftsum+root.data;
	}
	
	public int heightoftree(Node root) {
		//return the height at my level+return the max height from the left 
		//right node
		if(root==null) {
			return 0;
		}
		int left=heightoftree(root.left);
		int right=heightoftree(root.right);
		int curr=Math.max(left,right)+1;
		
		return curr;
	}
	//i have calculate diameter at my level with left height + right height+1
	//I have calculate diameter for left node also it can also have more nodes
	//i have calculate diameter for right node 
	//return the max diameter
	//the max diameter will have more nodes
	public int longestdiameter(Node root) {
		if(root==null) {
			return 0;
		}
		int left=heightoftree(root.left);
		int right=heightoftree(root.right);
		int diameter1=left+right+1;
		int diameter2=longestdiameter(root.left);
		int diameter3=longestdiameter(root.right);
		
		int max=Math.max(diameter1,Math.max(diameter2, diameter3));
		return max;
	}
	
	//in this at my level i have to pass the tree info of height and diameter 
	 public Treeinfo diameter2(Node root) {
		if(root==null) {
			return new Treeinfo(0,0);
		}
		Treeinfo left = diameter2(root.left);
		Treeinfo right=diameter2(root.right);
		
		int myheight=Math.max(left.ht,right.ht)+1;
	    int mydia=left.ht+right.ht+1;
	    int maxdia=Math.max(mydia, Math.max(left.dia,right.dia));
	    Treeinfo mytree=new Treeinfo(myheight,maxdia);
	    return mytree;
	 }
}	
	
	

