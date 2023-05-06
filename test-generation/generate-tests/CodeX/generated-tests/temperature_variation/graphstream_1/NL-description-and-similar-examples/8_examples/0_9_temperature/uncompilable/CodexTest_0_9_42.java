import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_42 { 
    @Test
    public void testContainsEdgeExistedInPath() {
    	Edge e1 = new Edge(1, 2, 1);
    	Edge e2 = new Edge(2, 3, 4);
    	Edge e3 = new Edge(3, 4, 5);
    	ArrayList<Edge> edges = new ArrayList<Edge>();
    	edges.add(e1);
    	edges.add(e2);
    	edges.add(e3);
    	Path p = new Path(edges);
    	assertEquals(true, p.contains(e1));
    }
}