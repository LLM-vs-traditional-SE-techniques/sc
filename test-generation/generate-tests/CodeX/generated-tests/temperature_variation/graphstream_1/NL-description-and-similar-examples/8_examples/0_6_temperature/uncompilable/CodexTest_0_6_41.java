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


public class CodexTest_0_6_41 { 
    @Test
    public void testContains() {
        DefaultEdge e1 = new DefaultEdge();
        DefaultEdge e2 = new DefaultEdge();
        DefaultEdge e3 = new DefaultEdge();
        DefaultEdge e4 = new DefaultEdge();
        List<DefaultEdge> edges = new ArrayList<>();
        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);
        EdgePath<DefaultEdge> path = new EdgePathImpl<>(edges);
        assertTrue(path.contains(e2));
        assertFalse(path.contains(new DefaultEdge()));
    }
}