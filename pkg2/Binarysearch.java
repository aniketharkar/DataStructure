package pkg2;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int target=16;
		int left=0;
		int right=arr.length-1;
//		search only in particular position to reduce the time
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println(mid);
				return;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
			
		}
		System.out.println("no doesnt exist");
		
		

	}

}
