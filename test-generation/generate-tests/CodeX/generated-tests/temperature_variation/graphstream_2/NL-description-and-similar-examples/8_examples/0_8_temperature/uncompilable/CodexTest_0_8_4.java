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


public class CodexTest_0_8_4 { 
  @Test
    public void add_shouldThrowErrorWhenEdgeIsNull() {
        Graph graph = new DefaultGraph("graph");
        Node nodeA = graph.addNode("A");
        Node nodeB = graph.addNode("B");
        Path path = new Path();
        try {
            path.add(null, graph.getEdge(nodeA, nodeB));
            fail("NullPointerException should have been thrown");
        } catch (NullPointerException e) {
            assertEquals("edge is null", e.getMessage());
        }
    }
}