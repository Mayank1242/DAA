package lab_practical_questions;

import java.util.Scanner;

public class Q2_Binary_search_itreative {

public static int Binary_search(int arr[],int low,int high,int key) {
	
	if(low<=high) {
		int mid=low+(high-low)/2;
		
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]>key) {
			return Binary_search(arr, low, mid-1, key);
		}
		
			return Binary_search(arr, mid+1, high, key);
		
		
	}
	return -1;
}

 public static void main(String args[]) {
	 System.out.println("Enter the size of the array:");
	 Scanner sc=new Scanner(System.in);
	 int size = sc.nextInt();
	 int[] arr=new int[size];
	 
	 for(int i=0;i<size;i++) {
		 arr[i]=sc.nextInt();
	 }
	 
	 
	 for(int i=0;i<size;i++) {
		System.out.print(arr[i] + " ");
	 }
	 int key;
	 System.out.println("Enter the element name you want ot search:");
	 key=sc.nextInt();
	 int result =(Binary_search(arr,0,arr.length-1,key));
	 if(result == -1) {
		 System.out.println("elemnt not found");
	 }
	 else {
	 System.out.println("Element find at:"+(Binary_search(arr,0,arr.length-1,key)+1)+"position");
	 }
 }
}
