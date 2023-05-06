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
    public void equals_whenPathsAreCreatedWithSameVertices_thenPathsAreEqual() {
        //given
        Graph<Vertex, Edge> graph = new DirectedOrderedSparseMultigraph<>();
        Vertex v1 = new DefaultVertex();
        Vertex v2 = new DefaultVertex();
        Vertex v3 = new DefaultVertex();
        graph.addEdge(new DefaultEdge(), v1, v2);
        graph.addEdge(new DefaultEdge(), v2, v3);
        Path path1 = new Path();
        path1.add(v1);
        path1.add(v2);
        path1.add(v3);
        Path path2 = new Path();
        path2.add(v1);
        path2.add(v2);
        path2.add(v3);
        //when
        boolean equals = path1.equals(path2);
        //then
        assertTrue(equals);
    }
    
    public void equals_whenPathsAreCreatedWithDifferentVertices_thenPathsAreEqual() {
        //given
        Graph<Vertex, Edge> graph = new DirectedOrderedSparseMultigraph<>();
        Vertex v1 = new DefaultVertex();
        Vertex
}