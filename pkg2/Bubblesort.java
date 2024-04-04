package pkg2;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,9,2,8,3,7,4,6,5,10,19,11,18,12,17,13,16,14,15};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
	 }

	}

}
