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


public class CodexTest_0_9_74 { 
   @Test
	public void testEqualOfTwoPaths() {
		Node node1 = new DefaultNode();
		Node node2 = new DefaultNode();
		Node node3 = new DefaultNode();
		Edge edge1 = new DefaultEdge();
		edge1.set(node1, node2);
		Edge edge2 = new DefaultEdge();
		edge2.set(node2, node3);
		node1.set(edge1);
		node2.set(edge2);
		Path p1 = new Path();
		Path p2 = new Path();
		p1.setRoot(node1);
		p2.setRoot(node1);
		p1.add(edge1);
		p2.add(edge1);
		p1.add(edge2);
		p2.add(edge2);
		Assert.assertTrue(p1.equals(p2));
	}
}