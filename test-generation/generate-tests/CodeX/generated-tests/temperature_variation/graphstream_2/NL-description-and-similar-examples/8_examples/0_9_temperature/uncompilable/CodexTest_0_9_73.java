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


public class CodexTest_0_9_73 { 
  /**
	 * Test that the contains() method returns expected results.
	 */
	@Test
	public void testContains() {
		assertFalse(path.contains(graph.getNode(a)));
		
		assertTrue(path.contains(graph.getNode(a)));
		assertTrue(path.contains(graph.getNode(b)));
		assertTrue(path.contains(graph.getNode(c)));
		assertTrue(path.contains(graph.getNode(d)));
		
		path.addNode(graph.getNode(c));
		assertFalse(path.contains(graph.getNode(a)));
		assertTrue(path.contains(graph.getNode(b)));
		assertTrue(path.contains(graph.getNode(c)));
		assertTrue(path.contains(graph.getNode(d)));
	}
}