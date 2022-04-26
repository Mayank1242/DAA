package sorting_algo;

public class Q7_Count_Sort {
	
	public static int getmax(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				 max=arr[i];
			}
		}
		return max;
	}
	public static void count_sort(int arr[]) {
		int max=getmax(arr);
		int newarr[]=new int[max+1];
		for(int i=0;i<max+1;i++) {
			newarr[i]=0;
		}
		for(int i=0;i<arr.length;i++) {
			newarr[arr[i]]++;
		}
		int i=0;
		int j=0;
		while(max>=i ) {
			if(newarr[i]>0) {
				arr[j]=i;
				newarr[i]--;
				j++;
			}else {
				i++;
			}
		}
		
	}
public static void main(String args[]) {
	int arr[]= {12,3,3,4,4,3,4,3};
	int n=arr.length;
	
	count_sort(arr);
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+ " ");
	}
	
}
}
