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


public class CodexTest_0_6_6 { 
  @Test
    public void testContains() {
		EdgePath path = new EdgePath();
		Edge a = new Edge(0, 1);
		Edge b = new Edge(1, 2);
		Edge c = new Edge(2, 3);
		Edge d = new Edge(3, 4);
		Edge e = new Edge(4, 5);
		path.add(a);
		path.add(b);
		path.add(c);
		path.add(d);
		assertTrue(path.contains(a));
		assertTrue(path.contains(b));
		assertTrue(path.contains(c));
		assertTrue(path.contains(d));
		assertFalse(path.contains(e));
	}
}