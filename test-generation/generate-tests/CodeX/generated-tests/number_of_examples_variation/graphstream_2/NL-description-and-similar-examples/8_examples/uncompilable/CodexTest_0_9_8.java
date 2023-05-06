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


public class CodexTest_0_9_8 { 
    @Test
    public void testEquals() {
        Path test = new Path();
        assertFalse(test.equals(null));
        assertFalse(test.equals(this));
        Path test2 = new Path();
        assertTrue(test.equals(test2));
        test.setRoot(graph.getNode(a));
        assertFalse(test.equals(test2));
        test2.setRoot(graph.getNode(a));
        test.add(graph.getEdge(ab));
        test.add(graph.getEdge(bc));
        assertFalse(test.equals(test2));
        test2.add(graph.getEdge(ab));
        test2.add(graph.getEdge(bc));
        assertTrue(test.equals(test2));
    }
}