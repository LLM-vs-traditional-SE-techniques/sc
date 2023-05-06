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


public class CodexTest_0_3_8 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertEquals(p1, p2);
        p1.add(graph.getEdge("ab"));
        assertNotEquals(p1, p2);
        p2.add(graph.getEdge("ab"));
        assertEquals(p1, p2);
        p1.add(graph.getEdge("bc"));
        assertNotEquals(p1, p2);
        p2.add(graph.getEdge("bc"));
        assertEquals(p1, p2);
        p1.add(graph.getEdge("cd"));
        assertNotEquals(p1, p2);
        p2.add(graph.getEdge("cd"));
        assertEquals(p1, p2);
    }
}