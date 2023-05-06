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


public class CodexTest_0_4_40 { 
    @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertTrue(p1.equals(p2));
        Graph graph = createSimpleGraph();
        p1.setRoot(graph.getNode(a));
        p2.setRoot(graph.getNode(a));
        assertTrue(p1.equals(p2));
        p1.add(graph.getEdge(ab));
        p2.add(graph.getEdge(ab));
        assertTrue(p1.equals(p2));
        p1.add(graph.getEdge(bc));
        p2.add(graph.getEdge(bc));
        assertTrue(p1.equals(p2));
    }
}