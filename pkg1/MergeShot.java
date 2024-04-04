package pkg1;

public class MergeShot {
	
	//create a function to divide the array 
	//get the middle point and pass the divide array 
	public static void divide(int arr[],int si,int ei) {
		if(si>=ei) {
			return ;
		}
		int mid = (si+ei)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquere(arr,si,mid,ei);
	}
	public static void conquere(int arr[],int si,int mid,int ei) {
		int k[]=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<arr[idx2]) {
				k[x]=arr[idx1];
				idx1++;
				x++;
			}
			else {
				k[x]=arr[idx2];
				idx2++;
				x++;
							}			
		}
		
		while(idx1<=mid) {
			k[x]=arr[idx1];
			idx1++;
			x++;
			
		}
		
		while(idx2<=ei) {
			k[x]=arr[idx2];
			idx2++;
			x++;
		}
		
		for(int i=0,j=si;i<k.length;j++,i++) {
			arr[j]=k[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,5,6,2,1,7,6,9,8};
		divide(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		}

	}

}
