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


public class CodexTest_0_5_50 { 
    @Test
    public void contains_whenEdgeIsAdded() {
        // given
        Graph graph = new DefaultGraph("test");
        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.addEdge("ab", "a", "b");
        graph.addEdge("bc", "b", "c");
        graph.addEdge("cd", "c", "d");
        graph.addEdge("de", "d", "e");
        graph.addEdge("ef", "e", "f");
        Path path = new Path();
        // when
        path.add(graph.getEdge("ab"));
        path.add(graph.getEdge("bc"));
        path.add(graph.getEdge("cd"));
        path.add(graph.getEdge("de"));
        path.add(graph.getEdge("ef"));
        // then
        assertTrue(path.contains(graph.getEdge("ab")));
        assertTrue(path.contains(graph.getEdge("bc")));
        assertTrue(path.contains(graph.getEdge("cd")));
        assertTrue(path.contains(graph.getEdge("de")));
        assertTrue(path.contains(graph.getEdge("ef")));
    }
}