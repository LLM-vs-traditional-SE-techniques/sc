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


public class CodexTest_0_3_1 { 
  @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge("a", "b", 1));
        path.add(new Edge("b", "c", 2));
        path.add(new Edge("c", "d", 3));
        assertTrue(path.contains(new Edge("a", "b", 1)));
        assertTrue(path.contains(new Edge("b", "c", 2)));
        assertTrue(path.contains(new Edge("c", "d", 3)));
        assertFalse(path.contains(new Edge("a", "b", 2)));
        assertFalse(path.contains(new Edge("a", "b", 3)));
        assertFalse(path.contains(new Edge("b", "c", 1)));
        assertFalse(path.contains(new Edge("b", "c", 3)));
        assertFalse(path.contains(new Edge("c", "d", 1)));
        assertFalse(path.contains(new Edge("c", "d", 2)));
    }
}