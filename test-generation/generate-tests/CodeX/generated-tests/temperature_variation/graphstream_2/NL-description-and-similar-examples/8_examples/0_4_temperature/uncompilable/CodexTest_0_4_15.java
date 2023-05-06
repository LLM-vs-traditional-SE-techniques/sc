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


public class CodexTest_0_4_15 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        Path p3 = new Path();
        p1.add(new Node(a));
        p2.add(new Node(a));
        p3.add(new Node(b));
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
        assertFalse(p2.equals(p3));
    }
}