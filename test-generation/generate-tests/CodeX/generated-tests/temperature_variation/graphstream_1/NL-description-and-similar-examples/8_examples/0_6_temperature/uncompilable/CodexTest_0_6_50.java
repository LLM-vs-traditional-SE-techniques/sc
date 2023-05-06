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


public class CodexTest_0_6_50 { 
    /**
     * Test method for {@link org.jgrapht.graph.AbstractDirectedGraph#addEdge(java.lang.Object, java.lang.Object, java.lang.Object)}
     * .
     */
    @Test
    public void testAddEdge() {
        assertTrue(graph.addEdge("1", "1", "1"));
        assertTrue(graph.containsEdge("1", "1"));
    }
}