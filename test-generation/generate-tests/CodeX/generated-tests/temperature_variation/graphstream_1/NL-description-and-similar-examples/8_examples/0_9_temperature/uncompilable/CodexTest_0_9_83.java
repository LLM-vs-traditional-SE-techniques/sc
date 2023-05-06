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


public class CodexTest_0_9_83 { 
  @Test
    public void contains_givenCanContainEdge() {
        // setup
        List<Edge> edges = new ArrayList<>();
        Edge edge1 = new DefaultEdge("1");
        Edge edge2 = new Edge.Builder("2").build();
        Edge edge3 = new DefaultEdge("3");
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        HashSet<Edge> edgePath = new HashSet<>();
        edgePath.add(edge1);
        edgePath.add(edge2);
        edgePath.add(edge3);
        Path path = new Path(edgePath, edges);
        // when
        // then
        assertTrue(path.contains(edge1));
        assertTrue(path.contains(edge2));
        assertTrue(path.contains(edge3));
    }
}