package salehh6;

import edu.princeton.cs.algs4.AcyclicSP;
import edu.princeton.cs.algs4.BellmanFordSP;
import edu.princeton.cs.algs4.BoyerMoore;
import edu.princeton.cs.algs4.DijkstraSP;
import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.KMP;
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
        char[] pattern = pat.toCharArray();
        char[] text    = txt.toCharArray();

        BoyerMoore boyermoore1 = new BoyerMoore(pat);
        BoyerMoore boyermoore2 = new BoyerMoore(pattern, 256);
        int offset1 = boyermoore1.search(txt);
        int offset2 = boyermoore2.search(text);

        // print results
        StdOut.println("text:    " + txt);

        StdOut.print("pattern: ");
        for (int i = 0; i < offset1; i++)
            StdOut.print(" ");
        StdOut.println(pat);

	}
}
