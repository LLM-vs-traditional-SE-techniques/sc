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


public class CodexTest_0_9_22 { 
  @Test
    public void testContains() {
		Graph<String, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);
		g.addVertex(A);
		g.addVertex(B);
		g.addVertex(C);
		g.addVertex(D);
		DefaultEdge e0 = g.addEdge(A, B);
		DefaultEdge e1 = g.addEdge(B, C);
		DefaultEdge e2 = g.addEdge(C, D);
		Path<String, DefaultEdge> path = new GraphWalk<>(g, A, D, Arrays.asList(e0, e1, e2), 3);
}