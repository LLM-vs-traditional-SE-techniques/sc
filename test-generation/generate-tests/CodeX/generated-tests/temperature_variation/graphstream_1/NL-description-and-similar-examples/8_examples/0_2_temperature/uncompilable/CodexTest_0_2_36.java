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


public class CodexTest_0_2_36 { 
    @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge("a", "b", "ab"));
        path.add(new Edge("b", "c", "bc"));
        path.add(new Edge("c", "d", "cd"));
        assertTrue(path.contains(new Edge("a", "b", "ab")));
        assertTrue(path.contains(new Edge("b", "c", "bc")));
        assertTrue(path.contains(new Edge("c", "d", "cd")));
        assertFalse(path.contains(new Edge("a", "c", "ac")));
        assertFalse(path.contains(new Edge("b", "d", "bd")));
        assertFalse(path.contains(new Edge("a", "d", "ad")));
    }
}