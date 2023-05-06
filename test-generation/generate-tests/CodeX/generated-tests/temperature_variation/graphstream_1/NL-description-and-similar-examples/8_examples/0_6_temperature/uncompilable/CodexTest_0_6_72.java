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


public class CodexTest_0_6_72 { 
  @Test
    public void testContains() {
			Edge e = new Edge(1, "a", "b");
			Path path = new Path();
			path.addEdge(e);
			assertTrue(path.contains(e));
		}
}