package salehh6;

import edu.princeton.cs.algs4.AcyclicSP;
import edu.princeton.cs.algs4.BellmanFordSP;
import edu.princeton.cs.algs4.DijkstraSP;
import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.princeton.cs.algs4.In;
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

		In in = new In("Q13.txt");
		int s = Integer.parseInt("0");
		EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);

		// find shortest path from s to each other vertex in DAG
		AcyclicSP sp = new AcyclicSP(G, s);

		for (int v = 0; v < G.V(); v++) {
			if (sp.hasPathTo(v)) {
				StdOut.printf("%d to %d (%.2f)  ", s, v, sp.distTo(v));
				for (DirectedEdge e : sp.pathTo(v)) {
					StdOut.print(e + "   ");
				}
				StdOut.println();
			} else {
				StdOut.printf("%d to %d         no path\n", s, v);
			}
		}

	}
}
