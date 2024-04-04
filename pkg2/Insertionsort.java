package pkg2;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,2,8,3,7,4,6,5,10,19,11,18,12,17,13,16,14,15,1};
		
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}

}
