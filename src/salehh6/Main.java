package salehh6;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Edge;
import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.KruskalMST;
import edu.princeton.cs.algs4.PrimMST;
import edu.princeton.cs.algs4.StdOut;

public class Main {

	public static void main(String[] args) {

//		// Q1 - a
//		In file = new In("tinyGex2.txt");
//		Graph graph = new Graph(file);

//		// Q5 - a
//		In file = new In("tinyDGex2.txt");
//		Digraph graph = new Digraph(file);

		// Q6
//		In file = new In("Q6.txt");
//		Digraph G = new Digraph(file);

		In in = new In("Q9.txt");
		EdgeWeightedGraph G = new EdgeWeightedGraph(in);
		PrimMST mst = new PrimMST(G);
		for (Edge e : mst.edges()) {
			StdOut.println(e);
		}
		StdOut.printf("%.5f\n", mst.weight());

	}

}
