package lab_practical_questions;

import java.util.ArrayList;
import java.util.Arrays;



class  uniform{
	String name;
	int INR;
	int hrs;
      uniform() {
	}
	uniform(String s,int i,int h){
		name=s;
		INR=i;
		hrs=h;
	}
}
public class Q4th_Job {
public static ArrayList<Integer> jobs(uniform arr[],int n){
	Arrays.sort(arr,(a,b)->b.INR-b.hrs);
	int max=0;
	for(int i=0;i<n;i++) {
		if(arr[i].hrs>max) {
			max=arr[i].hrs;
		}
	}
	int array[]=new int[max+1];
	for(int i=1;i<=max;i++) {
		array[i]=-1;
	}
	
	int countjobs=0;
	int totalprofit=0;
	for(int i=0;i<n;i++) {
		for(int j=arr[i].hrs;j>0;j--) {
			if(array[j]==-1) {
				array[j]=i;
				countjobs++;
				totalprofit+=arr[i].INR;
				break;
			}
		}
	}
	
	ArrayList<Integer> ans=new ArrayList<Integer>();
	
			ans.add(countjobs);
	ans.add(totalprofit);
	
	return ans;
	
}
public static void main(String args[]) {
//	                Person	Ram	Shyam	Rahul	Sita	Geeta	Rita
//	Fee Offered (INR)		28	 25	     45	       30    32       10
//	Deadline (hrs)	     	2	 2	     3	       1    1	     4
 
	uniform arr[]=new uniform[6];
	arr[0]= new uniform("Ram",28,2);
	arr[1]= new uniform("Shyam",25,2);
	arr[2]= new uniform("Rahul",45,3);
	arr[3]= new uniform("Sita",30,1);
	arr[4]= new uniform("Geeta",32,1);
	arr[5]= new uniform("Rita",10,4);
	
	
	ArrayList<Integer> result=jobs(arr,5 );
	System.out.print("Total jobs are done is:" +result.get(0)+"\nMaximum profit is:"+result.get(1));
}
}
