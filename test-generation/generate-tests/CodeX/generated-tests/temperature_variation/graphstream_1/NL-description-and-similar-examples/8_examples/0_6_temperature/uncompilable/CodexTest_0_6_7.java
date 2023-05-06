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


public class CodexTest_0_6_7 { 
    @Test
    public void testContainsEdge() {
        Edge edge1 = new Edge(1, 2, 3);
        Edge edge2 = new Edge(4, 5, 6);
        Edge edge3 = new Edge(7, 8, 9);
        Edge edge4 = new Edge(10, 11, 12);
        Edge edge5 = new Edge(13, 14, 15);
        Edge edge6 = new Edge(16, 17, 18);
        edgePath.add(edge1);
        edgePath.add(edge2);
        edgePath.add(edge3);
        edgePath.add(edge4);
        edgePath.add(edge5);
        assertFalse(edgePath.contains(edge6));
    }
}