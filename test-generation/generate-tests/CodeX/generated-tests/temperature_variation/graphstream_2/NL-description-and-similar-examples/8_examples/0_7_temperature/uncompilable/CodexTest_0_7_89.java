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


public class CodexTest_0_7_89 { 
  @Test
    public void testEquals() {
        Path p = new Path();
        p.add(new Edge(1, 2, 3));
        p.add(new Edge(4, 5, 6));
        Path q = new Path();
        q.add(new Edge(1, 2, 3));
        q.add(new Edge(4, 5, 6));
        assertEquals(p,q);
        q.add(new Edge(7, 8, 9));
        assertNotEquals(p,q);
    }
}