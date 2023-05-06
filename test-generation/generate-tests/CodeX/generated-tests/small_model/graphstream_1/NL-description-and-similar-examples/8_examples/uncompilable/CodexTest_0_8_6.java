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
    public void testContains() {
        Graph graph = new DefaultGraph();
        Node a = graph.addNode(1, "A");
        Node b = graph.addNode(2, "B");
        Edge ab = graph.addEdge(EdgeType.DIRECTED, a, b, 42);
        assertFalse(graph.contains(ab));
        graph.setEdge(ab);
        assertTrue(graph.contains(ab));
    }
}