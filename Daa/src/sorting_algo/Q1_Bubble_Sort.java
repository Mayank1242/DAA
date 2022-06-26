package sorting_algo;

import java.util.Iterator;

public class Q1_Bubble_Sort {

public static void Bubble_sort(int arr[],int n) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
/*
0 1 2 3 4
3 2 5 4 8   2 3 4 5 8
n=5  , 4
j n=4



*/
public static void main(String args[]) {
	int arr[]= {12,3,23,3,23,1,2,3,4,1212};
	int n=arr.length-1;
	
	
	Bubble_sort(arr,n);
	for (int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");;
		
	}
}
}
