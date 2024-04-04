package pkg2;

public class UsingTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie=new Trie();
		
		String[] words= {"there","their","the","a","any"};
		
		for(int i=0;i<words.length;i++) {
			trie.insert(words[i]);
		}
		
		System.out.println(trie.search("there"));
		System.out.println(trie.search("an"));

	}

}
