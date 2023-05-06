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


public class CodexTest_0_5_16 { 
    @Test
	public void testContains() {
		Edge e1 = new Edge("e1", "v1", "v2");
		Edge e2 = new Edge("e2", "v2", "v3");
		Edge e3 = new Edge("e3", "v3", "v4");
		Path path = new Path();
		path.add(e1);
		path.add(e2);
		path.add(e3);
		assertTrue(path.contains(e1));
		assertTrue(path.contains(e2));
		assertTrue(path.contains(e3));
	}
}