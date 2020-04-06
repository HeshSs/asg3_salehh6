package salehh6;

import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.KosarajuSharirSCC;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class Main {

	public static void main(String[] args) {

//		// Q1 - a
//		In file = new In("tinyGex2.txt");
//		Graph graph = new Graph(file);
		
//		// Q5 - a
		In file = new In("tinyDGex2.txt");
//		Digraph graph = new Digraph(file);
				
		// Q6
//		In file = new In("Q6.txt");
		Digraph G = new Digraph(file);
		
		System.out.println(G);

		KosarajuSharirSCC scc = new KosarajuSharirSCC(G);
		
        // number of connected components
        int m = scc.count();
        System.out.println(m + " strong components");

        // compute list of vertices in each strong component
        Queue<Integer>[] components = (Queue<Integer>[]) new Queue[m];
        for (int i = 0; i < m; i++) {
            components[i] = new Queue<Integer>();
        }
        for (int v = 0; v < G.V(); v++) {
            components[scc.id(v)].enqueue(v);
        }

        // print results
        for (int i = 0; i < m; i++) {
            for (int v : components[i]) {
                StdOut.print(v + " ");
            }
            StdOut.println();
        }				
	}

}
