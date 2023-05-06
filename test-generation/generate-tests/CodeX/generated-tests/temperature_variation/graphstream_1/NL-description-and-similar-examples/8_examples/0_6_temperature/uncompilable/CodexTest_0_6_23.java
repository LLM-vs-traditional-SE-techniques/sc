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


public class CodexTest_0_6_23 { 
    @Test
    public void testContains() {
        Path path = new Path();
        Edge edge1 = new Edge();
        edge1.setName(a);
        Edge edge2 = new Edge();
        edge2.setName(b);
        Edge edge3 = new Edge();
        edge3.setName(c);
        path.add(edge1);
        path.add(edge2);
        assertTrue(path.contains(edge1));
        assertTrue(path.contains(edge2));
        assertFalse(path.contains(edge3));
    }
}