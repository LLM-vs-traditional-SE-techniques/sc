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


public class CodexTest_0_2_9 { 
    @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge("A", "B"));
        path.add(new Edge("B", "C"));
        path.add(new Edge("C", "D"));
        path.add(new Edge("D", "E"));
        assertTrue(path.contains(new Edge("A", "B")));
        assertTrue(path.contains(new Edge("B", "C")));
        assertTrue(path.contains(new Edge("C", "D")));
        assertTrue(path.contains(new Edge("D", "E")));
        assertFalse(path.contains(new Edge("A", "C")));
        assertFalse(path.contains(new Edge("A", "D")));
        assertFalse(path.contains(new Edge("A", "E")));
        assertFalse(path.contains(new Edge("B", "D")));
        assertFalse(path.contains(new Edge("B", "E")));
        assertFalse(path.contains(new Edge("C", "E")));
    }
}