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


public class CodexTest_0_8_58 { 
  @Test
    public void testEquals() {
		Path path1 = new Path();
		Path path2 = new Path();
		Graph graph = new DefaultGraph("g1");
		graph.addNode("a");
		graph.addNode("b");
		graph.addNode("c");
		graph.addEdge("ab", "a", "b");
		graph.addEdge("bc", "b", "c");
		graph.addEdge("ca", "c", "a");
		path1.setRoot(graph.getNode("a"));
		path1.add(graph.getEdge("ab"));
		path1.add(graph.getEdge("bc"));
		path1.add(graph.getEdge("ca"));
		path2.setRoot(graph.getNode("a"));
		path2.add(graph.getEdge("ab"));
		path2.add(graph.getEdge("bc"));
		path2.add(graph.getEdge("ca"));
		Assert.assertTrue(path1.equals(path2));
		Assert.assertTrue(path2.equals(path1));
		path1.add(graph.getEdge("ab"));
		Assert.assertFalse(path1.equals(path2));
		Assert.assertFalse(path2.equals(path1));
		path2.add(graph.getEdge("ab"));
		Assert.assertTrue(path1.equals(path2));
		Assert.assertTrue(path2.equals(path1));
		Assert.assertFalse(path1.equals(null));
		Assert.assertFalse(path1.equals("foo"));
	}
}