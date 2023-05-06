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


public class CodexTest_0_6_22 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Graph graph = createSimpleGraph();
        Node nodeA = graph.getNode(a);
        Node nodeB = graph.getNode(b);
        Node nodeC = graph.getNode(c);
        p1.setRoot(nodeA);
        p1.add(graph.getEdge(ab));
        p1.add(graph.getEdge(bc));
        Path p2 = new Path();
        p2.setRoot(nodeA);
        p2.add(graph.getEdge(ab));
        p2.add(graph.getEdge(bc));
        Assert.assertTrue(p1.equals(p2));
    }
}