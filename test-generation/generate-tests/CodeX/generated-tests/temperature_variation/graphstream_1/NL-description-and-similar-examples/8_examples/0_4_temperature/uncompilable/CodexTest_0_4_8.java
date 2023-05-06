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


public class CodexTest_0_4_8 { 
  @Test
    public void testContains() {
        Edge e1 = new Edge(1, 2);
        Edge e2 = new Edge(2, 3);
        Edge e3 = new Edge(3, 4);
        Path p = new Path();
        p.add(e1);
        p.add(e2);
        p.add(e3);
        assertTrue(p.contains(e1));
        assertTrue(p.contains(e2));
        assertTrue(p.contains(e3));
    }
}