package sorting_algo;

public class Q4_merge_sort {

public static void concqure(int  arr[],int si,int mid,int ei) {
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
		
	public static void main(String args[]) {
		int arr[]= {12,3,23,3,23,1,2,3,4,1212};
		int n=arr.length;
		
		
		divide(arr,0,n-1);
		System.out.print("After Insertion Sort:");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");;
			
		}
	}
}
