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


public class CodexTest_0_9_1 { 
        @Test
	public void testContainsEdge() {
		Graph graph = new DefaultGraph("test");
		graph.setStrict(false);
		graph.setAutoCreate(true);
		graph.addEdge("ab", "a", "b");
		graph.addEdge("bc", "b", "c");
		graph.addEdge("cd", "c", "d");
		Path path = new Path();
		path.add(graph.getEdge("ab"));
		path.add(graph.getEdge("bc"));
		// test it returns true if the edge is contained
		assertTrue(path.contains(graph.getEdge("ab")));
		assertTrue(path.contains(graph.getEdge("bc")));
		// test it returns false if the edge is not contained
		assertFalse(path.contains(graph.getEdge("cd")));
	}
}