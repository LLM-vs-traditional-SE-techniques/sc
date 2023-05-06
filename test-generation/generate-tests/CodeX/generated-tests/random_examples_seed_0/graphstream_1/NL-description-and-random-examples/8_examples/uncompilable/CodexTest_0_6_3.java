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


public class CodexTest_0_6_3 { 
  @Test
    public void testContains() {
        Graph graph = new Graph();
        graph.addEdge(1, 2, 3);
        assertTrue(graph.contains(new Edge(1, 2, 3)));
        assertFalse(graph.contains(new Edge(2, 1, 3)));
    }
}