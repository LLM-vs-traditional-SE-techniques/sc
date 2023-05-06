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


public class CodexTest_0_9_1 { 
  @Test
    public void testContains_returnFalseForNotExistingEdge() {
        Edge edge1 = new DirectedEdge("a1", "a2");
        Edge edge2 = new DirectedEdge("a2", "a3");
        Edge edge3 = new DirectedEdge("a3", "a4");
        Edge edge4 = new DirectedEdge("a4", "a5");
        Edge edge5 = new DirectedEdge("a5", "a6");
        Edge edge6 = new DirectedEdge("a6", "a7");
        Path path = new Path();
        path.add(edge1);
        path.add(edge2);
        path.add(edge3);
        path.add(edge4);
        path.add(edge5);
        assertFalse(path.contains(edge6));
    }
}