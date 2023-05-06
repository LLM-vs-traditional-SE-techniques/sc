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


public class CodexTest_0_6_94 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertTrue(p1.equals(p2));
        Node n1 = new DefaultNode();
        Node n2 = new DefaultNode();
        Node n3 = new DefaultNode();
        p1.add(n1);
        p1.add(n2);
        p2.add(n1);
        p2.add(n2);
        assertTrue(p1.equals(p2));
        p1.add(n3);
        assertFalse(p1.equals(p2));
    }
}