package salehh6;

import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.KosarajuSharirSCC;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.SymbolDigraph;
import edu.princeton.cs.algs4.Topological;

public class Main {

	public static void main(String[] args) {

//		// Q1 - a
//		In file = new In("tinyGex2.txt");
//		Graph graph = new Graph(file);
		
//		// Q5 - a
//		In file = new In("tinyDGex2.txt");
//		Digraph graph = new Digraph(file);
				
		// Q6
		In file = new In("Q6.txt");
		Digraph G = new Digraph(file);
		
//		System.out.println(G);

//		KosarajuSharirSCC scc = new KosarajuSharirSCC(G);
						
		// Q7
        String filename  = "Q7.txt";
        String delimiter = "/";
        SymbolDigraph sg = new SymbolDigraph(filename, delimiter);
        Topological topological = new Topological(sg.digraph());
        for (int v : topological.order()) {
            StdOut.println(sg.nameOf(v));
        }		
	}

}
