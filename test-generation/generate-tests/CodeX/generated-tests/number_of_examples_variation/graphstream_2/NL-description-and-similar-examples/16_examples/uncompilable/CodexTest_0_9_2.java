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


public class CodexTest_0_9_2 { 
  @Test
    public void testReplace_shouldReplaceVertexInGraph() {
        Graph graph = createSimpleGraph();
        String oldId = graph.getNode(b).getId();
        String newId = x;
        graph.replaceNode(oldId, graph.getNode(newId));
        assertEquals(3, graph.getNodeCount());
        assertTrue(graph.containsNode(newId));
        assertFalse(graph.containsNode(oldId));
        assertEquals(2, graph.getEdgeCount());
        assertTrue(graph.containsEdge(ab));
        assertTrue(graph.containsEdge(xb));
        assertEquals(graph.getEdge(xb), graph.getEdge(ab).reversed());
    }
}