package sorting_algo;

import java.util.Iterator;

public class Q1_Bubble_Sort {

public static void Bubble_sort(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
	
public static void main(String args[]) {
	int arr[]= {12,3,23,3,23,1,2,3,4,1212};
	int n=arr.length;
	
	
	Bubble_sort(arr);
	for (int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");;
		
	}
}
}
