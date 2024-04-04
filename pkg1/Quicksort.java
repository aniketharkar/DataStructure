package pkg1;

public class Quicksort {
	//this function to bring my pivot at correct position 
	//once i get my level pivot at correct position at correct position 
	//then divide based on pivot and bring the other pivot in correct location
	public static void sort(int arr[],int low,int high) {
		if(low>=high) {
			return;
		}
		//function to get my level pivot at correct location
		int pi=corrpi(arr,low,high);
		
	 //once i get my pi at correct location then based on pi i will sort left
		//left and right array 
		sort(arr,low,pi-1);
		sort(arr,pi+1,high);
		}
	
	public static int corrpi(int arr[],int low,int high) {
		int pivot = high;
		int j=low;
		int i=j-1;
		//put pivot in such position that its left will have low value
		//if there are low value bring the low value in front 
		//if any value is less than pivot put it in starting position
		while(j<pivot) {
			if(arr[j]<arr[high]) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[pivot];
		arr[pivot]=temp;
		return i+1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,9,2,8,3,7,4,6,5,10,2,15};
		int low=0;
		int high=arr.length-1;
		System.out.println(" aa");
		sort(arr,low,high);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");

		}
		
	}
}	
