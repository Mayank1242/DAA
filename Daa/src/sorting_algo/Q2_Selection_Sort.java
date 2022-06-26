package sorting_algo;

public class Q2_Selection_Sort {

		public static void Selection_sort(int arr[]) {
			for(int i=0;i<arr.length-1;i++) {
				int smallest=i;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[smallest]) {
						smallest=j;
					}
				}
				int temp=arr[i];
				arr[i]=arr[smallest];
				arr[smallest]=temp;
			}
		}
/*
 * 
 * 
 * 2 3 1 8
 * smallest =1; 
 * tp=2
 * 1 3 2 8
 * smallest =3
 * j=2
 * smallest 2.
 * j=8
 * temp=3
 * 1 2 3 8
 * 
 * 
 * 
 */
		public static void main(String args[]) {
			int arr[]= {12,3,23,3,23,1,2,3,4,1212};
			int n=arr.length;
			
			
			Selection_sort(arr);
			System.out.print("After selection Sort:");
			for (int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");;
				
			}
		}
}
