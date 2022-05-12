package graph;
import java.util.*;
public class Graph_DFS_BFS {

	private LinkedList<Integer> adj[];    //array of linkedlist
	
	public Graph_DFS_BFS(int v) {       
		adj =new LinkedList[v];
		for(int i=0 ;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
   }
	
	public void addEdge(int sourse,int destination) {
		adj[sourse].add(destination);
		adj[destination].add(sourse);
	}
	
	public int dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			
			if(cur == destination) break;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		
		int cur = destination;
		int distance = 0;
		
		
		while(parent[cur] != -1) {
			System.out.print(cur+" -> ");
			cur = parent[cur];
			distance++;
		}
		
		return distance;
	}
	

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices and edeges ");
		int v=sc.nextInt();
		int e=sc.nextInt();
		
		Graph_DFS_BFS graph=new Graph_DFS_BFS(v);
		System.out.println("adding " + e + "Eges");
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			
			graph.addEdge(source, destination);
		}
		
System.out.println("Enter source and destination");
		
		int source = sc.nextInt();
		int destination = sc.nextInt();

		int distance = graph.dfsStack(source, destination);
		System.out.println("min distance is " + distance);
		
//		System.out.println("possible " + graph.dfsStack(source, destination));
		
		sc.close();
	}
}
