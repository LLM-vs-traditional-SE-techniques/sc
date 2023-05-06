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


public class CodexTest_0_3_7 { 
  @Test
    public void testContains() {
		Edge e1 = new Edge(1, 2);
		Edge e2 = new Edge(2, 3);
		Edge e3 = new Edge(3, 4);
		Edge e4 = new Edge(4, 5);
		Path p = new Path();
		p.add(e1);
		p.add(e2);
		p.add(e3);
		p.add(e4);
		assertTrue(p.contains(e1));
		assertTrue(p.contains(e2));
		assertTrue(p.contains(e3));
		assertTrue(p.contains(e4));
		assertFalse(p.contains(new Edge(1, 3)));
		assertFalse(p.contains(new Edge(3, 1)));
		assertFalse(p.contains(new Edge(5, 4)));
		assertFalse(p.contains(new Edge(4, 5)));
	}
}