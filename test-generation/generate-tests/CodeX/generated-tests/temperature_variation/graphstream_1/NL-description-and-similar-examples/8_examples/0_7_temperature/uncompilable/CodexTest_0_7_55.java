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


public class CodexTest_0_7_55 { 
    @Test
	public void testContains() {
		Path path = new Path(new Edge[] { new Edge("a", "b"), new Edge("b", "c") });
		assertTrue(path.contains(graph.getEdge("ab")));
		assertTrue(path.contains(graph.getEdge("bc")));
		assertFalse(path.contains(graph.getEdge("cd")));
	}
}