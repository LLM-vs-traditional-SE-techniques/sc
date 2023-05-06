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


public class CodexTest_0_8_9 { 
    @Test
    public void testContainsEdge() {
        Graph g = new DefaultGraph("test");
        Node a = g.addNode("a");
        Node b = g.addNode("b");
        Node c = g.addNode("c");
        Node d = g.addNode("d");
        g.addEdge("ab", a, b);
        g.addEdge("bc", b, c);
        g.addEdge("cd", c, d);
        Path path = new Path();
        path.add(g.getEdge("ab"));
        path.add(g.getEdge("bc"));
        path.add(g.getEdge("cd"));
        assertTrue(path.contains(g.getEdge("ab")));
    }
}