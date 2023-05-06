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


public class CodexTest_0_7_32 { 
  @Test
  public void testContainsWhenPathContainsEdge() {
		Graph graph = new SimpleGraph(DefaultEdge.class);
		graph.addVertex(A);
		graph.addVertex(B);
		graph.addVertex(C);
		graph.addVertex(D);
		graph.setEdgeWeight(A, B, 1.0);
		graph.setEdgeWeight(B, C, 2.0);
		graph.setEdgeWeight(C, D, 3.0);
		Path path = GraphPathImpl.createGraphPathFromVertices(graph, Arrays.asList(A, B, C, D), true, 9.0);
		assertTrue(path.contains(graph.getEdge(B, C)));
	}
}