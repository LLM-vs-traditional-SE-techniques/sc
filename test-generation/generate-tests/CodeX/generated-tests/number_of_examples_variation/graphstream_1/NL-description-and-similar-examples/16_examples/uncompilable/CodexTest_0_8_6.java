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


public class CodexTest_0_8_6 { 
  @Test
  public void testImpl() {
		Edge edge1 = new Edge("S1", "S2", "A", null, null);
		Edge edge2 = new Edge("S3", "S4", "B", null, null);
		Edge edge3 = new Edge("S2", "S3", "C", null, null);
		Path path = new Path();
		path.add(edge1);
		path.add(edge2);
		path.add(edge3);
		assertTrue(path.contains(edge1));
	}
}