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


public class CodexTest_0_9_38 { 
    @Test
	public void containsWhenTrue() {
		// given
		Path path = new Path();
		  Graph graph = new DefaultGraph("graph");
		  graph.setStrict(false);
		  graph.setAutoCreate(false);
		  graph.addEdge("ab", "a", "b");
		  graph.addEdge("bc", "b", "c");
		Edge e1 = graph.getEdge("ab");
	    Edge e2 = graph.getEdge("bc");
		path.addEdge(e1);
		path.addEdge(e2);
		// when
		boolean result = path.contains(e1);
		// then
		assertTrue(result);
	}
	@Test
	public void containsWhenFalse() {
		// given
		Path path = new Path();
		  Graph graph = new DefaultGraph("graph");
		  graph.setStrict(false);
		  graph.setAutoCreate(false);
		  graph.addEdge("ab", "a", "b");
		  graph.addEdge("bc", "b", "c");
		Edge e1 = graph.getEdge("ab");
	    Edge e2 = graph.getEdge("bc");
		path.addEdge(e1);
		path.addEdge(e2);
		// when
		boolean result = path.contains(e2);
		// then
		assertFalse(result);
	}
}