package revise;

import java.util.Scanner;

public class Q3_Binary_search {
	
	public static int binarysearch(int arr[],int low,int high,int key) {
		if(low<high) {
			int mid=low+(high-low)/2;
		    
			if(arr[mid]==key) {
				return mid;
			}
			if(key<arr[mid]) {
				return binarysearch(arr,low,mid,key);
			}
			else {
				return binarysearch(arr,mid+1,high,key);
			}
			
		}
		return -1;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("ENter element in the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("\nEnter the element you want to search:");  
		int key =sc.nextInt();
		int result=binarysearch(arr,0,n-1,key);
		
		if(result==-1) {
			System.out.println("Cant find the element");
		}else {
			System.out.println("your elemnt is found at "+ (result+1)+ " location");
		}
	}
}
