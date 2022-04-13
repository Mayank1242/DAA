package sorting_algo;

public class Q3_Insertion_Sort {
public static void Insertion_Sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int current=arr[i];
		    int j=i-1;
		    while(j>=0 && current<arr[j]) {
		    	arr[j+1] =arr[j];
		    	
		    	j--;
		    }
		    arr[j+1]=current;
		}
}
		
	public static void main(String args[]) {
		int arr[]= {12,3,23,3,23,1,2,3,4,1212};
		int n=arr.length;
		
		
		Insertion_Sort(arr);
		System.out.print("After Insertion Sort:");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");;
			
		}
	}
}
