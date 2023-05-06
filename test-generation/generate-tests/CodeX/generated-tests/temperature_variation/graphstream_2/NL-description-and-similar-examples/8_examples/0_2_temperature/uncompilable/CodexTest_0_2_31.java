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


public class CodexTest_0_2_31 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertTrue(p1.equals(p2));
        p1.add(new Edge(new Node(1), new Node(2)));
        assertFalse(p1.equals(p2));
        p2.add(new Edge(new Node(1), new Node(2)));
        assertTrue(p1.equals(p2));
        p1.add(new Edge(new Node(2), new Node(3)));
        assertFalse(p1.equals(p2));
        p2.add(new Edge(new Node(2), new Node(3)));
        assertTrue(p1.equals(p2));
    }
}