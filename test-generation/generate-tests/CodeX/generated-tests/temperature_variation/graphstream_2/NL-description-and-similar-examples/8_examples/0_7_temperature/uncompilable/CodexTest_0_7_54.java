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


public class CodexTest_0_7_54 { 
    @Test
	public void testPathsEquals() {
		Graph graph = createSimpleGraph();
		Path p1 = new Path(graph.getNode(a));
		p1.add(graph.getEdge(ab));
		Path p2 = new Path(graph.getNode(a));
		p2.add(graph.getEdge(ab));
		assertTrue(p1.equals(p2));
		assertTrue(p2.equals(p1));
	}

}