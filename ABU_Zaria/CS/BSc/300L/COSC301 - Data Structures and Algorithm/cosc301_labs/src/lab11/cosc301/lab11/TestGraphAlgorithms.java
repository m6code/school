package lab11.cosc301.lab11;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
import lab01.cosc301.PrintingVisitor;
import lab10.cosc301.Graph;
import lab10.cosc301.GraphAsArrayLists;
import lab11.cosc301.Algorithms;

public class TestGraphAlgorithms {
	static Scanner stdin = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Enter file name: ");
		String fname = stdin.nextLine().trim();
		File file = new File(fname);
		Scanner in = new Scanner(file);
		int vertexCount = in.nextInt();
		in.nextLine(); // discard the remaining input line

		// Note: You need to comment one of the following lines depending on your type of graph

	    //GraphAsMatrix graph = new GraphAsMatrix(vertexCount, true);
		
		// GraphAsLists graph = new GraphAsLists(false);
		GraphAsArrayLists graph = new GraphAsArrayLists(vertexCount, true);

		initializeGraph(graph, in, vertexCount);
		int choice;
		String label;

		do {
			showMenu();
			choice = getChoice();

			switch (choice) {
			case 1: // Topological order traversal
				if (!graph.isDirected())
					System.out.println("\nSorry, the graph is not directed");
				else if (graph.isCyclic())
					System.out.println("\nSorry, the graph is cyclic");
				else {
					System.out.println("\nTopological Order Listing is :");
					graph.topologicalOrderTraversal(new PrintingVisitor());
				}
				break;
			case 2: // Check for connectedness
				if (graph.isDirected()) {
					if (graph.isStronglyConnected())
						System.out.println("\nThe graph is strongly Connected");
					else if (graph.isWeaklyConnected())
						System.out.println("\nThe graph is weakly Connected");
					else
						System.out.println("\nThe graph is not connected");
				} else {
					if (graph.isConnected())
						System.out.println("\nThe graph is Connected");
					else
						System.out.println("\nThe graph is not connected");
				}
				break;
			case 3: // check for cycle
				if (graph.isCyclic())
					System.out.println("\nThe graph is cyclic");
				else
					System.out.println("\nThe graph is not cyclic");
				break;
			case 4: // count connected components
				System.out.println("\nThe number of connected components is : "
						+ graph.countConnectedComponents());
				break;
			case 5: // execute Dijkstra's algorithm
				if (graph.isDirected()) {
					// check that the graph is weighted
					if (!graph.isWeighted())
						System.out.println("\nSorry, The graph is not weighted");
					else {
						System.out.print("\nEnter the Label of the starting vertex: ");
						label = stdin.nextLine();
						System.out.println("\nThe result of Dijkstra's algorithm starting from vertex "
										+ label + " is:");
						System.out.println("\n"
								+ Algorithms.dijkstrasAlgorithm(graph, graph
										.getVertex(label)));
					}
				} else
					System.out.println("\nSorry, the graph must be directed");
				break;
			case 6:// execute Prim's algorithm
				if (!graph.isDirected()) {
					if (!graph.isWeighted())
						System.out
								.println("\nSorry, The graph is not weighted");
					else {
						System.out.print("\nEnter the starting vertex: ");
						label = stdin.nextLine();
						System.out
								.println("\nThe result of Prim's algorithm starting from vertex "
										+ label + " is:");
						System.out.println("\n"
								+ Algorithms.primsAlgorithm(graph, graph
										.getVertex(label)));
					}
				} else
					System.out.println("\nSorry, the graph must be undirected");
				break;
			case 7:// execute Kruskal's algorithm
				if (!graph.isDirected()) {
					if (!graph.isWeighted())
						System.out
								.println("\nSorry, The graph is not weighted");
					else {
						System.out
								.println("\nThe result of Kruskal's algorithm is:");
						System.out.println("\n"
								+ Algorithms.kruskalsAlgorithm(graph));
					}
				} else
					System.out.println("\nSorry, the graph must be undirected");
				break;
			}

		} while (choice != 8);
	}

	public static void initializeGraph(Graph graph, Scanner in, int count) {
		int weight;
		for (int i = 0; i < count; i++) {
			StringTokenizer tokenizer = new StringTokenizer(in.nextLine(), " ,");
			String label = tokenizer.nextToken();
			if (tokenizer.hasMoreTokens()) {
				weight = Integer.parseInt(tokenizer.nextToken());
				graph.addVertex(label, new Integer(weight));
			} else
				graph.addVertex(label);
		}

		while (in.hasNextLine()) {
			StringTokenizer tokenizer = new StringTokenizer(in.nextLine(), " ,");
			String from = tokenizer.nextToken();
			String to = tokenizer.nextToken();
			if (tokenizer.hasMoreTokens()) {
				weight = Integer.parseInt(tokenizer.nextToken());
				graph.addEdge(from, to, new Integer(weight));
			} else
				graph.addEdge(from, to);
		}
	}

	static int getChoice() {
		int choice;
		do {
			System.out.print("\rYour choice? : ");
			choice = stdin.nextInt();
		} while (choice < 1 || choice > 8);
		stdin.nextLine();
		return choice;
	}

	static void showMenu() {
		System.out.println("\n\n********************************");
		System.out.println("*   Testing Graph Algorithms  *");
		System.out.println("********************************");
		System.out.println("1.  Topological Order Traversal");
		System.out.println("2.  Check for Connectedness");
		System.out.println("3.  Check for Cyclic");
		System.out.println("4.  Count Connected Components");
		System.out.println("5.  Dijkstra's Algorithm for Shortest path");
		System.out.println("6.  Prim's Algorithm for MCST");
		System.out.println("7.  Kruskal's Algorithm for MCST");
		System.out.println("8.  Quit");
	}
}
