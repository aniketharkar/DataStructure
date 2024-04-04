package pkg2;
import java.util.*;

public class Hashmaps<k,v>{
	public class Node{
		k key;
		v value;
		Node(k key,v value){
			this.key=key;
			this.value=value;
		}
	}
	int n;
	int N;
	
	LinkedList<Node> bucket[];
	
	Hashmaps(){
		N=4;
		bucket=new LinkedList[4];
		for(int bi=0;bi<N;bi++) {
			bucket[bi]=new LinkedList<>();
		}
	}
	
	public int hashfunction(k key) {
		return Math.abs(key.hashCode())%N;
	}
	
	public int search(k key,int b) {
		LinkedList<Node> bi=bucket[b];
		for(int di=0;di<bi.size();di++) {
			if(bi.get(di).key==key) {
				return di;
			}
		}
		return -1;
	}
	
	public void rehash() {
		LinkedList<Node> oldbucket[]=bucket;
		bucket=new LinkedList[N*2];
		for(int bi=0;bi<oldbucket.length;bi++) {
			LinkedList<Node> l1=oldbucket[bi];
			for(int di=0;di<l1.size();di++) {
				Node node=l1.get(di);
				put(node.key,node.value);
			}
		}
	}
	
	public void put(k key,v value) {
		int bi=hashfunction(key);
		int di=search(key,bi);
		
		if(di==-1) {
			bucket[bi].add(new Node(key,value));
			n++;
		}
		else {
			Node node=bucket[bi].get(di);
			node.value=value;
		}
		
		double lambda=(double)n/N;
		if(lambda>2.0) {
			rehash();
		}
	}
	
	public v remove(k key) {
		int bi=hashfunction(key);
		int di=search(key,bi);
		
		if(di==-1) {
			return null;
		}
		else {
			Node node=bucket[bi].get(di);
			bucket[bi].remove(di);
			n--;
			return node.value;
			
		}
	}
	
	public boolean containskey(k key) {
		int bi=hashfunction(key);
		int di=search(key,bi);
		
		if(di==-1) {
			return false;
		}
		else {
			Node node=bucket[bi].get(di);
//			bucket[bi].remove(di);
			return true;
			
		}
	}
	
	public v getkey(k key) {
		int bi=hashfunction(key);
		int di=search(key,bi);
		
		if(di==-1) {
			return null;
		}
		else {
			Node node=bucket[bi].get(di);
//			bucket[bi].remove(di);
//			return true;
			return node.value;
			
		}
	}
	
	public ArrayList<k> keyset() {
		ArrayList<k> keyset=new ArrayList<>();
		for(int bi=0;bi<bucket.length;bi++) {
			LinkedList<Node> l1=bucket[bi];
			for(int di=0;di<l1.size();di++) {
				Node node=l1.get(di);
				keyset.add(node.key);
			}
		}
		return keyset;
	}
	

}
