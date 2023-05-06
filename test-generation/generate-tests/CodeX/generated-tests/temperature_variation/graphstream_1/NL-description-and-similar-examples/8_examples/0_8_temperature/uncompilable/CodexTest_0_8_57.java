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


public class CodexTest_0_8_57 { 
    @Test
    public void contains_whenInPath() throws Exception {
        // given
        Graph<String, Edge> graph = factory.createGraph();
        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addEdge("ab", "a", "b");
        Path<String, Edge> path = new PathImpl<>();
        path.add(graph.getVertex("a"));
        // when
        boolean result = path.contains(graph.getEdge("ab"));
        // then
        assertTrue(result);
    }
}