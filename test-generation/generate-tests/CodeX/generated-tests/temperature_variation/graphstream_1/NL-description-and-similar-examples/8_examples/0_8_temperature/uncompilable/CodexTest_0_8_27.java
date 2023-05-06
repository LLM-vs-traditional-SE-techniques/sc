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


public class CodexTest_0_8_27 { 
  @Test
  public void testContains() {
		Path<String, Edge> path = new Path<>();
		Graph<String, Edge> graph = new DefaultGraph<>("TEST", true, false);
		graph.addEdge("A", "B");
		graph.addEdge("B", "C");
		graph.addEdge("C", "D");
		graph.addEdge("A", "D");
		path.add(graph.getEdge("A", "B"));
		path.add(graph.getEdge("B", "C"));
		path.add(graph.getEdge("C", "D"));
		assertTrue(path.contains(graph.getEdge("B", "C")));
		assertFalse(path.contains(graph.getEdge("B", "D")));
	}
}