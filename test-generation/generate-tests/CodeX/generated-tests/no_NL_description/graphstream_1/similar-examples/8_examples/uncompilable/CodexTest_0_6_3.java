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


public class CodexTest_0_6_3 { 
  @Test
       public void testContainsEdge() {
		Edge e1 = new DirectedEdge(v1, v2);
		Edge e2 = new DirectedEdge(v2, v3);
		Edge e3 = new DirectedEdge(v3, v4);
		Path path = new Path(e1, e2, e3);
		assertTrue(path.contains(e1));
		assertTrue(path.contains(e2));
		assertTrue(path.contains(e3));
	}
}