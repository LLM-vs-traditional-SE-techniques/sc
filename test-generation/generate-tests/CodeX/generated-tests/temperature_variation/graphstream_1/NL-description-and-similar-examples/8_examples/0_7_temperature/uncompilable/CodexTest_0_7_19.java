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


public class CodexTest_0_7_19 { 
        @Test
	public void testContainsEdge() {
		Graph graph = new DefaultGraph("test");
		Node node1 = graph.addNode("1");
		Node node2 = graph.addNode("2");
		Edge edge1 = graph.addEdge(node1, node2, "1");
		Edge edge2 = graph.addEdge(node2, node1, "2");
		Path path = new Path();
		path.add(edge1);
		assertTrue(path.contains(edge1));
		assertFalse(path.contains(edge2));
	}
}