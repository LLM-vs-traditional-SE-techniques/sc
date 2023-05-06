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


public class CodexTest_0_8_84 { 
  @Test
    public void testContains() {
        graph.edge(1, 2, 10);
        graph.edge(2, 3, 30);
        Path path = new Path(graph, 1);
        path.appendEdge(graph.getEdge(1, 2));
        path.appendEdge(graph.getEdge(2, 3));
        assertTrue(path.contains(graph.getEdge(2, 3)));
        assertFalse(path.contains(graph.getEdge(3, 2)));
    }
}