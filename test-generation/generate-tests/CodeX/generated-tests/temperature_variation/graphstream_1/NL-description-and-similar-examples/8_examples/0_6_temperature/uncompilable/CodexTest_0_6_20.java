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


public class CodexTest_0_6_20 { 
  @Test
  public void testContains() {
		Path path = new Path();
		path.add(graph.getEdge("ab"));
		path.add(graph.getEdge("bc"));
		path.add(graph.getEdge("cd"));
		Assert.assertTrue(path.contains(graph.getEdge("ab")));
		Assert.assertTrue(path.contains(graph.getEdge("cd")));
		Assert.assertFalse(path.contains(graph.getEdge("dc")));
	}
}