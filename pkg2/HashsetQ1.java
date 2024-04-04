package pkg2;
import java.util.*;

public class HashsetQ1 {
	public static void intersection(int arr1[],int arr2[]) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		int count=0;
		System.out.print("Intersection->");
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				System.out.print(arr2[i]+",");
				count++;
				set.remove(arr2[i]);
			}
		}
		System.out.println();
		System.out.print("intersection count is "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {7,3,9,5,6};
		int arr2[]= {6,3,9,2,9,4};
		
		intersection(arr1,arr2);

	}

}
