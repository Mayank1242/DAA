package lab_question;
import java.util.Arrays;
 class Graph
{
	int V;
	int[][] g;

	public Graph(int V)
	{
		this.V = V;
		
		// Rows may not be contiguous
		g = new int[V + 1][V + 1];
		for(int i = 0; i < V + 1; i++)
		{
			
			// Initialize all entries
			// as false to indicate
			// that there are
			// no edges initially
			Arrays.fill(g[i], 0);
		}

		// Initializing node to itself
		// as it is always reachable
		for(int i = 1; i <= V; i++)
			g[i][i] = 1;
	}
	
	// Function to add edge between nodes
	void addEdge(int v, int w)
	{
		g[v][w] = 1;
		g[w][v] = 1;
	}

	// Function to check if nodes are reachable
	boolean isReachable(int s, int d)
	{
		if (g[s][d] == 1)
			return true;
		else
			return false;
	}
	
	// Function to compute the path
	void computePaths()
	{
		
		// Use Floyd Warshall algorithm
		// to detect if a path exists
		for(int k = 1; k <= V; k++)
		{
			
			// Try every vertex as an
			// intermediate vertex
			// to check if a path exists
			for(int i = 1; i <= V; i++)
			{
				for(int j = 1; j <= V; j++)
					g[i][j] = g[i][j] | ((g[i][k] != 0 &&
							g[k][j] != 0) ? 1 : 0);
			}
		}
	}
};

public class Question4 {
	public static void main(String[] args)
	{
		Graph _g = new Graph(6);
		_g.addEdge(1, 3);
		_g.addEdge(2, 3);
		_g.addEdge(1, 4);
		_g.computePaths();

		int u = 4, v = 3;
		if (_g.isReachable(u, v))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	}

	// This code is contributed by sanjeev2552


