package pkg2;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,9,2,8,3,7,4,6,5,10,19,11,18,12,17,13,16,14,15};
		
		for(int i=0;i<arr.length;i++) {
			int minvalue=i;
			for(int j=i+1;j<arr.length;j++) {
//				compare with minvalue and find the real min value 
				if(arr[minvalue]>arr[j]) {
					minvalue=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[minvalue];
			arr[minvalue]=temp;
		}
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}

}
