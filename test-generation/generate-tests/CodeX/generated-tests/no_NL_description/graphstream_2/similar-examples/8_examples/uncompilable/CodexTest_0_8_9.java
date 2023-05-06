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
      public void equals_shouldReturnTrueWhenComparingToEdgePathWithEqualEdges() {
        Graph g = new DefaultGraph("g");
        g.setStrict(false);
        g.setAutoCreate(true);
        Node a = g.addNode("a");
        Node b = g.addNode("b");
        g.addEdge("ab", "a", "b");
        Path p = new Path();
        p.add(a);
        p.add(g.getEdge("ab"));
        assertTrue(p.equals(a, g.getEdge("ab")));
    }
}