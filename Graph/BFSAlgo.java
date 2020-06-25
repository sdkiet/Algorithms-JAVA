
import java.util.*;

class Graph {
    
    // A utility function to add an edge in an
    // undirected graph
    static void addEdge(ArrayList<ArrayList<Integer> > adj,
                        int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    // Function to perform BFS traversal of a Graph
    static void BFS(ArrayList<ArrayList<Integer> > adj, int V)
    {
        // Initialize a boolean array
        // to keep track of visited vertices
        boolean visited[] =  new boolean[V+1];
    
        // Mark all vertices not-visited initially
        for (int i = 1; i <= V; i++)
            visited[i] = false;
        
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
    
        // The start vertex or source vertex is 1
        int s = 1;
        
        // Mark the current node as 
        // visited and enqueue it 
        visited[s]=true; 
        queue.add(s);   
        
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
            System.out.print(s+" "); 
  
            for (int i = 0; i < adj.get(s).size(); i++) {
                
                int newNode = adj.get(s).get(i);
                // Check if it is not visited
                if(visited[newNode] == false){}
                    visited[newNode] = true;
                    queue.add(newNode);
                }
            }
        } 
    }
    
    // Driver Code
    public static void main(String[] args)
    {
        // Creating a graph with 6 vertices
        int V = 6;
        ArrayList<ArrayList<Integer> > adj 
                    = new ArrayList<ArrayList<Integer> >(V+1);
        
        for (int i = 0; i < V+1; i++)
            adj.add(new ArrayList<Integer>());

        // Adding edges one by one
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);
        
        BFS(adj, V);
    }
}