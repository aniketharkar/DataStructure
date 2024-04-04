package pkg2;
import java.util.ArrayList;

public class Binaryseartree {

	
	
	public Node insert(Node root,int val) {
		if(root==null) {
			Node rootn=new Node(val);
			return rootn;
		}
		else if(root.data>val) {
			root.left=insert(root.left,val);
			
		}
		else if(root.data<val) {
			root.right=insert(root.right,val);
		
		}
		return root;
	}
	
	public boolean find(Node root,int val) {
	   if(root==null) {
		   return false;
	   }
	    if(root.data==val) {
		   return true;
	   }
	   else if(root.data<val) {
		  return find(root.right,val);   
	   }
	   else if(root.data>val) {
		   return find(root.left,val);
	   }
	   return false;
	}

	public void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public Node delete(Node root,int val) {
		if(root.data<val) {
			root.right=delete(root.right,val);
		}
		else if(root.data>val) {
		root.left=delete(root.left,val);
		}
		else {
			if(root.left==null && root.right==null) {
				return null;
			}
			else if( root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			
			Node suc=successor(root.right);
			root.data=suc.data;
			root.right=delete(root.right,suc.data);
			
		}
		return root;
		
		}
	public Node successor(Node root){
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}
	
	public void Printinrange(Node root,int x,int y) {
		if(root==null) {
		
			return;
		}
		if(root.data==x) {
			System.out.print(root.data+" ");
			Printinrange(root.right,x,y);
		}
		else if(root.data==y) {
			System.out.print(root.data+" ");
			Printinrange(root.left,x,y);
		}
		else if(root.data>x && root.data<y) {
			Printinrange(root.left,x,y);
			System.out.print(root.data+" ");
			Printinrange(root.right,x,y);
		}
		else if(root.data<x) {
			Printinrange(root.right,x,y);
		}
		else {
			Printinrange(root.left,x,y);
		}
		
		
	
	}
	
	public void Path(Node root,ArrayList<Integer> path) {
		if(root==null) {
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right==null) {
			printpath(path);
//			path.remove(path.size()-1);
		}
		else {
			Path(root.left,path);
			Path(root.right,path);
		}
		path.remove(path.size()-1);
	
	}
	public void printpath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+"->");
		}
		System.out.println();
	}
}	
