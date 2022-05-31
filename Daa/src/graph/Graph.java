package graph;
import java.util.*;
public class Graph {

	private LinkedList<Integer> adj[];    //array of linkedlist
	
	public Graph(int v) {       
		adj =new LinkedList[v];
		for(int i=0 ;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
   }
	
	public void addEdge(int sourse,int destination) {
		adj[sourse].add(destination);
		adj[destination].add(sourse);
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices and edeges ");
		int v=sc.nextInt();
		int e=sc.nextInt();
		
		Graph graph=new Graph(v);
		System.out.println("adding " + e + "Eges");
		for(int i=0;i<6;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			
			graph.addEdge(source, destination);
		}
		
      System.out.println("Enter source and destination");
		
		int source = sc.nextInt();
		int destination = sc.nextInt();

	
	}
}
