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


public class CodexTest_0_8_14 { 
  @Test
    public void testContains() {
		// given
		Path path = new Path();
		Graph graph = new DefaultGraph("test");
		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		Edge edge = graph.addEdge("a", "b", "ab");
		path.add(edge);
		// when
		boolean contains = path.contains(edge);
		// then
		assertFalse(contains);
	}
}