package salehh6;

import edu.princeton.cs.algs4.AcyclicSP;
import edu.princeton.cs.algs4.BellmanFordSP;
import edu.princeton.cs.algs4.BoyerMoore;
import edu.princeton.cs.algs4.DijkstraSP;
import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.KMP;
import edu.princeton.cs.algs4.RabinKarp;
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

        String pat = "a b a c a b";
        String txt = "b a c a a b a c c a b a c a b a a b b";

        RabinKarp searcher = new RabinKarp(pat);
        int offset = searcher.search(txt);

        // print results
        StdOut.println("text:    " + txt);

        // from brute force search method 1
        StdOut.print("pattern: ");
        for (int i = 0; i < offset; i++)
            StdOut.print(" ");
        StdOut.println(pat);

	}
}
