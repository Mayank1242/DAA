package sorting_algo;

public class Q6_Heap_Sort {

	public static void heapsort(int arr[]) {
		int n=arr.length;
		
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	public static void heapify(int arr[],int n,int i) {
		 int largest = i; // Initialize largest as root
	        int l = 2 * i + 1; // left = 2*i + 1
	        int r = 2 * i + 2; // right = 2*i + 2
	 
	        // If left child is larger than root
	        if (l < n && arr[l] > arr[largest])
	            largest = l;
	 
	        // If right child is larger than largest so far
	        if (r < n && arr[r] > arr[largest])
	            largest = r;
	 
	        // If largest is not root
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	 
	            // Recursively heapify the affected sub-tree
	            heapify(arr, n, largest);
	        }
	}
	public static void main(String args[]) {
		int arr[]= {1,2,4,5,6,89,0};
		int n=arr.length;
		
		
		heapsort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
