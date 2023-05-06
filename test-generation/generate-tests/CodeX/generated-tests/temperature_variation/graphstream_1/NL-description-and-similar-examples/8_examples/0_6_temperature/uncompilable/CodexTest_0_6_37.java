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


public class CodexTest_0_6_37 { 
  @Test
	public void testContains() {
		Path<V, E> path = new Path<V, E>();
		V v1 = new Vertex("v1");
		V v2 = new Vertex("v2");
		E e1 = new Edge("e1", v1, v2);
		assertFalse(path.contains(e1));
		path.append(e1);
		assertTrue(path.contains(e1));
	}
}