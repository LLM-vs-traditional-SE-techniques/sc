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


public class CodexTest_0_5_68 { 
    @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        // empty paths are equal
        assertTrue(p1.equals(p2));
        // add a node to both paths
        p1.add(g.getNode(a));
        p2.add(g.getNode(a));
        // compared paths are equal
        assertTrue(p1.equals(p2));
        // add a second node to both paths
        p1.add(g.getNode(b));
        p2.add(g.getNode(b));
        // compared paths are equal
        assertTrue(p1.equals(p2));
        // add a third node to the first path
        p1.add(g.getNode(c));
        // compared paths are not equal
        assertFalse(p1.equals(p2));
    }
}