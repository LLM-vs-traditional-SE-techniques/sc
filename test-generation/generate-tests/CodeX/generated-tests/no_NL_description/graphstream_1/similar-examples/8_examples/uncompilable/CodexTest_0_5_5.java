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


public class CodexTest_0_5_5 { 
  @Test
    public void testContains() {
        // given
        Graph<String, DefaultEdge> graph = createSimpleGraph();
        Path<String, DefaultEdge> path = new PathImpl<String, DefaultEdge>(graph);
        path.addVertex("a");
        path.addVertex("b");
        path.addVertex("c");
        path.addVertex("d");
        path.addVertex("e");
        // when
        boolean result = path.contains(graph.getEdge("a", "b"));
        // then
        assertTrue(result);
    }
}