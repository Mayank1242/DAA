package lab_practical_questions;
import java.util.Scanner;

public class Q1_linear_search_recusive {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number of test cases: ");
		int t = sc.nextInt();
		while(t>0)
		{
			System.out.print("enter number elemnts: ");
			int n =sc.nextInt();
			
			System.out.print("enter array elements: ");
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
		}
	}
}
