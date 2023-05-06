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


public class CodexTest_0_8_3 { 
  @Test
    public void testContainsWhenEdgeAdded() {
        Edge ab = new DefaultEdge("ab", "a", "b");
        Edge ac = new DefaultEdge("ac", "a", "c");
        Edge cd = new DefaultEdge("cd", "c", "d");
        Edge bd = new DefaultEdge("bd", "b", "d");
        Graph g = new DefaultGraph("Graph");
        g.addVertex("a");
        g.addVertex("b");
        g.addVertex("c");
        g.addVertex("d");
        g.addEdge(ab);
        g.addEdge(ac);
        g.addEdge(cd);
        g.addEdge(bd);
        Path p = new Path();
        p.add(ab);
        assertTrue(p.contains(ab));
    }
}