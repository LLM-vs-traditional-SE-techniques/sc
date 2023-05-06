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


public class CodexTest_0_3_71 { 
    @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        Path p3 = new Path();
        Graph g = createSimpleGraph();
        p1.setRoot(g.getNode(a));
        p2.setRoot(g.getNode(b));
        p3.setRoot(g.getNode(a));
        p1.add(g.getEdge(ab));
        p1.add(g.getEdge(bc));
        p2.add(g.getEdge(bc));
        p2.add(g.getEdge(cd));
        p3.add(g.getEdge(ab));
        p3.add(g.getEdge(bc));
        assertFalse(p1.equals(p2));
        assertTrue(p1.equals(p3));
    }
}