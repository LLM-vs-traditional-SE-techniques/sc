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


public class CodexTest_0_3_72 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        p1.add(null, new Edge(new Node("a"), new Node("b")));
        p1.add(new Node("b"), new Edge(new Node("b"), new Node("c")));
        p1.add(new Node("c"), new Edge(new Node("c"), new Node("d")));
        p2.add(null, new Edge(new Node("a"), new Node("b")));
        p2.add(new Node("b"), new Edge(new Node("b"), new Node("c")));
        p2.add(new Node("c"), new Edge(new Node("c"), new Node("d")));
        assertTrue(p1.equals(p2));
        p2.add(new Node("d"), new Edge(new Node("d"), new Node("e")));
        assertFalse(p1.equals(p2));
    }
}