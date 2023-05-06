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


public class CodexTest_0_8_34 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        p1.add(new Node(node1));
        p1.add(new Node(node2));
        Path p2 = new Path();
        p2.add(new Node(node1));
        p2.add(new Node(node2));
        Path p3 = new Path();
        p3.add(new Node(node2));
        p3.add(new Node(node3));
        assertTrue(p1.equals(p1));
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
    }
}