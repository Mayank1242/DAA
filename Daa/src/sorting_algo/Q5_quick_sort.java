package sorting_algo;

public class Q5_quick_sort {
	
	public static int partiton(int arr[],int low,int high) {
		int piviot=arr[high];
		int i=low-1;
		// 2 1 4 5 4
		for(int j=low;j<high;j++) {
			if(arr[j]<piviot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=piviot;
		arr[high]=temp;
		
		return i;
		
		
		
	}
	public static void quicksort(int arr[],int si,int ei) {
		if(si<ei) {
			int piviot_indx=partiton(arr,si,ei);
			quicksort(arr, si, piviot_indx-1);
			quicksort(arr, piviot_indx+1, ei);
		}
	}
public static  void main(String args[]) {
	int arr[]= {12,3,4,5,2,3,2};
	int n=arr.length;
	
	quicksort(arr,0,n-1);
	for(int i=0;i<n;i++) {
		System.out.print(arr[i] + " ");
	}
}
}
