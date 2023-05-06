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


public class CodexTest_0_4_1 { 
  @Test
    public void testEquals() {
		Path p1 = new Path();
		p1.setRoot(graph.getNode(a));
		p1.add(graph.getEdge(ab));
		p1.add(graph.getEdge(bc));
		p1.add(graph.getEdge(cd));
		Path p2 = new Path();
		p2.setRoot(graph.getNode(a));
		p2.add(graph.getEdge(ab));
		p2.add(graph.getEdge(bc));
		p2.add(graph.getEdge(cd));
		assertTrue(p1.equals(p2));
		assertTrue(p2.equals(p1));
		p2.add(graph.getEdge(da));
		assertFalse(p1.equals(p2));
		assertFalse(p2.equals(p1));
	}
}