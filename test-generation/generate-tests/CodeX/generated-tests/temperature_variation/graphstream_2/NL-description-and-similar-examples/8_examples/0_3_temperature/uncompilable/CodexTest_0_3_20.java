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


public class CodexTest_0_3_20 { 
  @Test
    public void testEquals() {
			Path p1 = new Path();
			Path p2 = new Path();
			Path p3 = new Path();
			Graph graph = createSimpleGraph();
			p1.setRoot(graph.getNode(a));
			p1.add(graph.getEdge(ab));
			p1.add(graph.getEdge(bc));
			p2.setRoot(graph.getNode(a));
			p2.add(graph.getEdge(ab));
			p2.add(graph.getEdge(bc));
			p3.setRoot(graph.getNode(a));
			p3.add(graph.getEdge(ab));
			p3.add(graph.getEdge(bd));
			Assert.assertTrue(p1.equals(p2));
			Assert.assertFalse(p1.equals(p3));
		}
}