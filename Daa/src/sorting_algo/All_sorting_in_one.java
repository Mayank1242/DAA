package sorting_algo;

import java.util.Iterator;

public class All_sorting_in_one {
	
	public static void bubblesort(int arr[],int n) {
		int count=0;
		for(int i=0;i<n-1;i++) {
			for (int j=0;j<n-1-i;j++) {
				if (arr[j]>arr[j+1]) {
				     int temp=arr[j];
				     arr[j]=arr[j+1];
				     arr[j+1]=temp;
				     count++;
				}
				
			}
		}
		System.out.print("\no of swaps:" +count);
	}
	
	public static void selection(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[j]<arr[smallest]) {
					smallest=j;
				}
				int temp=arr[i];
				arr[i]=arr[smallest];
				arr[smallest]=temp;
			}
		}
	}
	public static void concqure(int arr[],int si,int mid,int ei) {
		int merged[]=new int[ei-si+1];
		int indx1=si;
		int indx2=mid+1;
		int x=0;
		
	while(indx1<=mid && indx2<=ei) {
			if(arr[indx1]<=arr[indx2]) {
				merged[x]=arr[indx1];
				x++; indx1++;
			}else {
				merged[x]=arr[indx2];
				x++; indx2++;
			}
		}
	while(indx1<=mid ) {
		merged[x]=arr[indx1];
		x++; indx1++;
	}
	while(indx2<=ei) {
		merged[x]=arr[indx2];
		x++; indx2++;
		
	}
	for(int i=0,j=si;i<merged.length;i++,j++) {
		arr[j]=merged[i];
	}
	}
	public static void divide(int arr[],int low,int high) {
		if(low<high) {
			
		int mid=low+(high-low)/2;
		divide(arr,low,mid);
		divide(arr,mid+1,high);
		concqure(arr,low,mid,high);
		}
	}
	
	
	
public static int partion(int arr[],int low,int high) {
		
		int piviot=arr[0];
		
		return 0;
	}
	public static void quick(int arr[],int low,int high) {
		
		int piviotindx=partion(arr,low,high);
		
		quick(arr,low,piviotindx-1);
		quick(arr,piviotindx+1,high);
		
	}
    public static void main(String args[]){
    int arr[]= {41,4,54,554,4};
    int n=arr.length;
    
    System.out.println("before sorting:");
    for(int i=0;i<n;i++) {
    	System.out.print(arr[i]+  " ");
    }
    bubblesort(arr ,n);
    System.out.println("\nafter bubble sorting:");
    
    for(int i=0;i<n;i++) {
    	System.out.print(arr[i]+  " ");
    }
    

    divide(arr, 0, n-1);
    System.out.println("\nafter merge sorting:"); 
    for(int i=0;i<n;i++) {
    	System.out.print(arr[i]+  " ");
    }
    
    }
}
