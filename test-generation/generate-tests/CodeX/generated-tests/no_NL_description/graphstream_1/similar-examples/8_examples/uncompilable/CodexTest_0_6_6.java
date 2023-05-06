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
		Path path = new Path();
		path.add(new AbstractEdge("a", "b", "ab", 0.0));
		path.add(new AbstractEdge("b", "c", "bc", 0.0));
		path.add(new AbstractEdge("c", "d", "cd", 0.0));
		assertTrue(path.contains(new AbstractEdge("a", "b", "ab", 0.0)));
		assertTrue(path.contains(new AbstractEdge("a", "c", "ab", 0.0)));
		assertTrue(path.contains(new AbstractEdge("a", "d", "ab", 0.0)));
		assertFalse(path.contains(new AbstractEdge("d", "a", "ab", 0.0)));
	}
}