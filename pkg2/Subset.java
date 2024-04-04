package pkg2;
import java.util.*;

public class Subset {
	public static void printsubset(ArrayList<Integer> subset) {
		for(int i=0;i<subset.size();i++) {
			System.out.print(subset.get(i)+" ");
		}
		System.out.println();
	}
	public static void findsubset(int n,ArrayList<Integer> subset) {
		if(n==0) {
			printsubset(subset);
			return;
		}
		subset.add(n);
		findsubset(n-1,subset);
		subset.remove(subset.size()-1);
		findsubset(n-1,subset);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
	 findsubset(3,al);

	}

}
