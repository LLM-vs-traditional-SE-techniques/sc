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


public class CodexTest_0_9_3 { 
    @Test
    public void testEqualTo() {
        Graph<V, E> g1 = createGraph();
        Graph<V, E> g2 = createGraph();
        g1.addVertex(v1);
        g1.addVertex(v2);
        g2.addVertex(v2);
        g2.addVertex(v1);
        g1.addEdge(v1, v2);
        g2.addEdge(v1, v2);
        assertEquals(g1, g2);
}
}