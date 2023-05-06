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


public class CodexTest_0_9_43 { 
  	@Test
	public void testContains() {
		final Graph graph = Graph.Util.deserialize("./tests/a1.gv");
		final Node a = graph.getNode("a");
		final Node b = graph.getNode("b");
		final Node c = graph.getNode("c");
		final Node d = graph.getNode("d");
		Path path = new Path();
		Edge ab = a.getEdgeTo(b);
		Edge bc = b.getEdgeTo(c);
		Edge cd = c.getEdgeTo(d);
}