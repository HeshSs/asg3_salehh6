package salehh6;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;

public class Main {

	public static void main(String[] args) {

		In file = new In("tinyGex2.txt");
		
		Graph graph = new Graph(file);
		
		System.out.println(graph);
		
	}

}
