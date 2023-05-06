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


public class CodexTest_0_7_76 { 
    @Test
    public void testContains() {
        Graph<Integer, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);
        Graphs.addAllVertices(g, Arrays.asList(1, 2, 3));
        DefaultEdge e1 = Graphs.addEdge(g, 1, 2);
        DefaultEdge e2 = Graphs.addEdge(g, 2, 3);
        Path<Integer, DefaultEdge> path = GraphWalk.singletonWalk(g, 1, e1, e2);
        assertTrue(path.contains(e1));
        assertTrue(path.contains(e2));
        assertFalse(path.contains(Graphs.addEdge(g, 3, 1)));
    }
}