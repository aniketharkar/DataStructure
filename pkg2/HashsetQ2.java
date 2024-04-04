package pkg2;
import java.util.*;

public class HashsetQ2 {
	public static void union(int arr1[],int arr2[]) {
		HashSet<Integer> set=new HashSet<>();
//		?
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		
		System.out.println("union value "+set);
		System.out.println("union set length "+set.size());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {7,3,9};
		int arr2[]= {6,3,9,2,9,4};
		union(arr1,arr2);

	}

}
