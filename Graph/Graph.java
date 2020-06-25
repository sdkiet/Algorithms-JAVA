import java.util.*;
import java.awt.Point;
import java.lang.Math; 
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.stream.IntStream;
     
    public class Graph{
         static int oo = (int)1e9;
      public static void main(String[] args) {
    	    InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            Scanner in = new Scanner(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            Musk solver = new Musk();
            solver.solve(1, in, out);
            out.close();
    	}
    	
    static class Musk {
       
       static int inf = (int) 1e9 + 7;
       public void solve(int testNumber, Scanner in, PrintWriter out) {
                int v = 5;
                ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
                
                for(int i=0;i<v;i++){
                    adj.add(new ArrayList<Integer>());
                }
                
                addEdge(adj, 0, 1);
                addEdge(adj, 0, 4);
                addEdge(adj, 1, 2);
                addEdge(adj, 1, 3);
                addEdge(adj, 1, 4);
                addEdge(adj, 2, 3);
                addEdge(adj, 3, 4);

                printGraph(adj);
       }

       void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
           adj.get(u).add(v);
           adj.get(v).add(u);
       }

       void printGraph(ArrayList<ArrayList<Integer>> adj){
           for(int i=0;i<adj.size();i++){
               System.out.println("Adjacency list of vertex " + i);
               for(int j=0;j<adj.get(i).size();j++){
                 System.out.print(i);
                   System.out.print("->"+adj.get(i).get(j));
               }
               System.out.println();
           }
       }
    }  
}           