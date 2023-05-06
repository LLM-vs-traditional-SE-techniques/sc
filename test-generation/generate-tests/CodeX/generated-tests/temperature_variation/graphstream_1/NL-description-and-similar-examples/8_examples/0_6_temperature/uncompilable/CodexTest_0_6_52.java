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


public class CodexTest_0_6_52 { 
  @Test
  public void testContains() {
		// given
		Path path = new Path();
		Graph graph = new DefaultGraph("graph");
		graph.setAutoCreate(true);
		graph.setStrict(true);
		graph.addEdge("ab", "a", "b");
		graph.addEdge("bc", "b", "c");
		path.add(graph, "a", "b");
		// when
		boolean result = path.contains(graph.getEdge("ab"));
		// then
		assertTrue(result);
	}
}