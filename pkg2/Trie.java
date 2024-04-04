package pkg2;

public class Trie {
   
	public static Nod root=new Nod();
		public void insert(String words) {
			Nod node=root;
			for(int i=0;i<words.length();i++) {
				int id=words.charAt(i)-'a';
				if(node.children[id]==null) {
					node.children[id]=new Nod();
				}
				
				node=node.children[id];
			}
			node.eow=true;
		}
		
		
		public boolean search(String words) {
			Nod node=root;
			for(int i=0;i<words.length();i++) {
				int id=words.charAt(i)-'a';
				if(node.children[id]==null) {
					return false;
				}
				
				node=node.children[id];
			}
			return node.eow==true;
		}
	
		
	}

