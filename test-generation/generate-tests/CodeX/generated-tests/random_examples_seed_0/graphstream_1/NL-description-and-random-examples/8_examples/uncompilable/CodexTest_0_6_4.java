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


public class CodexTest_0_6_4 { 
  @Test
  public void testContains() {
		EdgePath ep = new EdgePath(Arrays.asList(new Edge(1, 2), new Edge(2, 3)));
		EdgePath ep2 = new EdgePath(Arrays.asList(new Edge(1, 2), new Edge(2, 3), new Edge(3, 4)));
		assertTrue(ep.contains(new Edge(1, 2)));
		assertTrue(ep2.contains(new Edge(1, 2)));
		assertTrue(ep2.contains(new Edge(2, 3)));
		assertTrue(ep2.contains(new Edge(3, 4)));
		assertFalse(ep.contains(new Edge(1, 3)));
		assertFalse(ep2.contains(new Edge(4, 3)));
	}
}