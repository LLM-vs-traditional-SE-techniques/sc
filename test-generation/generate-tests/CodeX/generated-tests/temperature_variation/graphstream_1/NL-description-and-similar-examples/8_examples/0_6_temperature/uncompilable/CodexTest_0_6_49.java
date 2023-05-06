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


public class CodexTest_0_6_49 { 
  @Test
    public void testContainsEdge() {
        Graph g = new DefaultGraph("test");
        g.setStrict(false);
        g.setAutoCreate(true);
        g.addEdge("ab", "a", "b");
        g.addEdge("bc", "b", "c");
        g.addEdge("cd", "c", "d");
        Path p = new Path();
        p.add(g.getEdge("ab"));
        assertTrue(p.contains(g.getEdge("ab")));
    }
}