package pkg2;
import java.util.*;

public class HashmapQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> pref=new HashMap<>();
		pref.put(0,1);
		int arr[]= {10,2,-2,-20,10};
		int k=10;
		int ans=0;
		for(int i=0,sum=0;i<arr.length;i++) {
			sum+=arr[i];
			if(pref.containsKey(sum-k)) {
				ans+=pref.get(sum-k);
			}
			if(pref.containsKey(sum)) {
				pref.put(sum,pref.get(sum)+1);
				
			}
			else {
				pref.put(sum, 1);
			}
		}
		
		System.out.println(pref);
//		int ans=0;
//		for(int i=0,sum=0;i<arr.length;i++) {
//			sum+=arr[i];
//			if(pref.containsKey(sum-k)) {
//				ans+=pref.get(sum);
//			}
//		}
		System.out.println(ans);

	}

}
