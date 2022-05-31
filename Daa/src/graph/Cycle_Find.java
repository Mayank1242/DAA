package graph;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Cycle_Find {
	
	private final int V;
	private final List<List<Integer>> adj;

	public Cycle_Find(int V)
	{
		this.V = V;
		adj = new ArrayList<>(V);
		
		for (int i = 0; i < V; i++)
			adj.add(new LinkedList<>());
	}
	
	
	private boolean isCyclicUtil(int i, boolean[] visited,
									boolean[] recStack)
	{
		
		// Mark the current node as visited and
		// part of recursion stack
		if (recStack[i])
			return true;

		if (visited[i])
			return false;
			
		visited[i] = true;

		recStack[i] = true;
		List<Integer> children = adj.get(i);
		
		for (Integer c: children)
			if (isCyclicUtil(c, visited, recStack))
				return true;
				
		recStack[i] = false;

		return false;
	}

	private void addEdge(int source, int dest) {
		adj.get(source).add(dest);
	}

	
	private boolean isCyclic()
	{
		
		// Mark all the vertices as not visited and
		// not part of recursion stack
		boolean[] visited = new boolean[V];
		boolean[] recStack = new boolean[V];
		
		
		
		for (int i = 0; i < V; i++)
			if (isCyclicUtil(i, visited, recStack))
				return true;

		return false;
	}

	// Driver code
	public static void main(String[] args)
	{
		Cycle_Find graph = new Cycle_Find(6);
	// | 0 1 2 3 4 5 
	//-|-------------	
	//0| 0 1 0 0 0 0
	//1| 0 0 1 0 1 0
	//2| 0 0 0 1 0 1
	//3| 0 0 0 0 0 1
	//4| 1 0 1 0 0 0
	//5| 0 0 0 0 1 0
		
		
		graph.addEdge(0, 1);
		
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 5);
		graph.addEdge(3, 5);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		graph.addEdge(5,4);
		
		if(graph.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't "
									+ "contain cycle");
	}
}



