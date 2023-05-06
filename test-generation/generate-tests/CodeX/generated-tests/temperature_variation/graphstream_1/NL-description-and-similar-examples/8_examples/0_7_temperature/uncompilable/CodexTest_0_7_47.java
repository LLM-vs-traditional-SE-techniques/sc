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


public class CodexTest_0_7_47 { 
    @Test
    public void testContains() {
        Graph g = new DefaultGraph("g");
        g.addEdge(1, "a", "b");
        Path p = new Path();
        p.add(g.getEdge(1));
        assertTrue(p.contains(g.getEdge(1)));
    }
}