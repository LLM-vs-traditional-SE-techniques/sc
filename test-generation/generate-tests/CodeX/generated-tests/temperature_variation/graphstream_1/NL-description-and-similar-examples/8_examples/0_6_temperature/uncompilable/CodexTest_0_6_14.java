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


public class CodexTest_0_6_14 { 
    @Test
    public void testContains() {
        Graph graph = createGraph();
        Path path = new Path();
        path.add(graph.getEdge("ab"));
        path.add(graph.getEdge("bc"));
        assertTrue(path.contains(graph.getEdge("bc")));
        assertFalse(path.contains(graph.getEdge("cd")));
    }
}