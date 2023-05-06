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


public class CodexTest_0_8_24 { 
  @Test
    public void testContains() {
		Path path = new Path();
		Graph graph = new DefaultGraph("g1");
		graph.addEdge("ab", "a", "b");
		graph.addEdge("bc", "b", "c");
		graph.addEdge("bd", "b", "d");
		path.nodePath.add(graph.getNode("b"));
		path.edgePath.add(graph.getEdge("ab"));
		assertTrue("Must contain edge ab", path.contains(graph.getEdge("ab")));
		assertFalse("Must not contain edge bc", path.contains(graph.getEdge("bc")));
		assertFalse("Must not contain edge bd", path.contains(graph.getEdge("bd")));
	}
}