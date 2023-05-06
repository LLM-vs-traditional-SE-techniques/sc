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


public class CodexTest_0_8_9 { 
    @Test
	public void test_contains_edge_edgePath() {
		assertFalse(path.contains(edge5));
		assertFalse(path.contains(edge2));
		assertTrue(path.contains(edge1));
		assertTrue(path.contains(edge7));
		assertTrue(path.contains(edge6));
		assertTrue(path.contains(edge4));
		assertFalse(path.contains(edge3));
	}

}