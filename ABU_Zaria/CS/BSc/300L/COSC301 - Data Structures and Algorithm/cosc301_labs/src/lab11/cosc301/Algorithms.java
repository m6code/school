package lab11.cosc301;

import lab01.cosc301.Iterator;
import lab02.cosc301.Association;
import lab07.cosc301.BinaryHeap;
import lab07.cosc301.PriorityQueue;
import lab10.cosc301.Edge;
import lab10.cosc301.Graph;
import lab10.cosc301.GraphAsLists;
import lab10.cosc301.Vertex;

public class Algorithms
{
    static final class Entry
    {

        boolean known;
        int distance;
        Vertex predecessor;

        Entry()
        {
            known = false;
            distance = Integer.MAX_VALUE;
            predecessor = null;
        }
    }

    public static Graph dijkstrasAlgorithm(Graph g, Vertex start)
    {
        int n = g.getNumberOfVertices();
        Entry table[] = new Entry[n];
        for(int v = 0; v < n; v++)
            table[v] = new Entry();

        table[g.getIndex(start)].distance = 0;
        PriorityQueue queue = new BinaryHeap(g.getNumberOfEdges());
        queue.enqueue(new Association(new Integer(0), start));
        while(!queue.isEmpty()) 
        {
            Association association = (Association)queue.dequeueMin();
            Vertex v1 = (Vertex) association.getValue();
            int n1 = g.getIndex(v1);
            if(!table[n1].known)
            {
                table[n1].known = true;
 				Iterator p = v1.getEmanatingEdges();
 				while (p.hasNext())
                {
                    Edge edge = (Edge) p.next();
                    Vertex v2 = edge.getMate(v1);
                    int n2 = g.getIndex(v2);
                    Integer weight = (Integer) edge.getWeight();
                    int d = table[n1].distance + weight.intValue();
                    if(table[n2].distance > d)
                    {
                        table[n2].distance = d;
                        table[n2].predecessor = v1;
                        queue.enqueue(new Association(new Integer(d), v2));
                    }
                }

            }
        }
        Graph result = new GraphAsLists(true);
        Iterator it = g.getVertices();
        while (it.hasNext()){
        	Vertex v = (Vertex) it.next();
            result.addVertex(v.getLabel(),new Integer(table[g.getIndex(v)].distance));
        }
        
        it = g.getVertices();
        while (it.hasNext()){
        	Vertex v = (Vertex) it.next();
        	if (v != start){
        		String from = v.getLabel();
        		String to = table[g.getIndex(v)].predecessor.getLabel();
                result.addEdge(from, to);
            }
        }
        return result;
    }

    public static Graph primsAlgorithm(Graph g, Vertex start)
    {
        int n = g.getNumberOfVertices();
        Entry table[] = new Entry[n];
        for(int v = 0; v < n; v++)
            table[v] = new Entry();

        table[g.getIndex(start)].distance = 0;
        PriorityQueue queue = new BinaryHeap(g.getNumberOfEdges());
        queue.enqueue(new Association(new Integer(0), start));
        while(!queue.isEmpty()) 
        {
            Association association = (Association)queue.dequeueMin();
            Vertex v1 = (Vertex) association.getValue();
            int n1 = g.getIndex(v1);
            if(!table[n1].known)
            {
                table[n1].known = true;
 				Iterator p = v1.getEmanatingEdges();
 				while (p.hasNext())
                {
                    Edge edge = (Edge) p.next();
                    Vertex v2 = edge.getMate(v1);
                    int n2 = g.getIndex(v2);
                    Integer weight = (Integer) edge.getWeight();
                    int d = weight.intValue();
                    if(!table[n2].known && table[n2].distance > d)
                    {
                        table[n2].distance = d;
                        table[n2].predecessor = v1;
                        queue.enqueue(new Association(new Integer(d), v2));
                    }
                }

            }
        }
        GraphAsLists result = new GraphAsLists(false);
        Iterator it = g.getVertices();
        while (it.hasNext()){
        	Vertex v = (Vertex) it.next();
            result.addVertex(v.getLabel());
        }
        
        it = g.getVertices();
        while (it.hasNext()){
        	Vertex v = (Vertex) it.next();
        	if (v != start){
        		int index = g.getIndex(v);
        		String from = v.getLabel();
        		String to = table[index].predecessor.getLabel();
                result.addEdge(from, to, new Integer(table[index].distance));
			}
        }
        return result;
    }

    public static Graph kruskalsAlgorithm(Graph g)
    {
        
        Graph result = new GraphAsLists(false);
		Iterator it = g.getVertices();
		while (it.hasNext()){
			Vertex v = (Vertex)it.next();
            result.addVertex(v.getLabel());
		}

        PriorityQueue queue = new BinaryHeap(g.getNumberOfEdges());
        it = g.getEdges();
        while(it.hasNext()){
        	Edge e = (Edge) it.next();
        	if (e.getWeight()==null)
        		throw new IllegalArgumentException("Graph is not weighted");
        		
			queue.enqueue(e);
        }
		
		while (!queue.isEmpty()){
			Edge e = (Edge) queue.dequeueMin();
			String from = e.getFromVertex().getLabel();
			String to = e.getToVertex().getLabel();
			if (!result.isReachable(from, to)){
				result.addEdge(from,to,e.getWeight());
			}
		}
		
        return result;
    }
}
