package sorting_algo;

public class Q3_Insertion_Sort {
public static void Insertion_Sort(int arr[],int n) {
		for(int i=1;i<=n;i++) {
			int current=arr[i];
		    int j=i-1;
		    while(j>=0 && current<arr[j]) {
		    	arr[j+1] =arr[j];
		    	j--;
		    }
		    arr[j+1]=current;
		}
}
/*
 * 
 * 
 * 2| 4 3 1
     index
c=4  1
j=2  0
2 4 3 1
c=3 2
j=4 1
2 3 4 1
j=2 0
 2 3 4 1
 c=4
 j =3


 */
	public static void main(String args[]) {
		int arr[]= {12,3,23,2};
		int n=arr.length-1;
//		System.out.println(n);
		
		
		Insertion_Sort(arr,n);
		System.out.print("After Insertion Sort:");
		for (int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");;
			
		}
	}
}
