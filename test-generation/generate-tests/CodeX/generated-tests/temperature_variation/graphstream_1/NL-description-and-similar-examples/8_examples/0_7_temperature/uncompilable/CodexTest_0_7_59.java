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


public class CodexTest_0_7_59 { 
  @Test
  public void testDoesNotContainEdge() {
		  Graph<Integer, DefaultEdge> g = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge.class);
		  g.addVertex(1);
		  g.addVertex(2);
		  DefaultEdge e = g.addEdge(1, 2);
		  Path<Integer, DefaultEdge> path = new Path<Integer, DefaultEdge>(g);
		  assertFalse(path.contains(e));
		  path.appendEdge(e);
		  assertTrue(path.contains(e));
	}
}