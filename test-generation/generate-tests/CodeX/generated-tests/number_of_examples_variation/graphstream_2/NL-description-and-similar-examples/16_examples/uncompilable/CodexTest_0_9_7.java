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


public class CodexTest_0_9_7 { 
  @Test
    public void testEqualPaths() {
        Graph graph = createSimpleGraph();
        Path path1 = new Path(graph.getNode("a"), graph.getEdge("ab"), graph.getNode("b"), graph.getEdge("bc"), graph.getNode("c"), graph.getEdge("cd"), graph.getNode("d"));
        Path path2 = new Path(graph.getNode("a"), graph.getEdge("ab"), graph.getNode("b"), graph.getEdge("bc"), graph.getNode("c"), graph.getEdge("cd"), graph.getNode("d"));
        assertTrue(path1.equals(path2));
    }
}