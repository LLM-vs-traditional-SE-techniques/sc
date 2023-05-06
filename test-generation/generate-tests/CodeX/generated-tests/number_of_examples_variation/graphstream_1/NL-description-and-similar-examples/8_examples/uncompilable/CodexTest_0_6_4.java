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


public class CodexTest_0_6_4 { 
    @Test
    public void testContainsEdge() {
        DefaultGraph<Integer, DefaultWeightedEdge> graph =
            new DefaultGraph<>(DefaultWeightedEdge.class);
        DefaultWeightedEdge e1 = Graphs.addEdgeWithVertices(graph, 0, 1, 1.0);
        DefaultWeightedEdge e2 = Graphs.addEdgeWithVertices(graph, 1, 2, 2.0);
        DefaultWeightedEdge e3 = Graphs.addEdgeWithVertices(graph, 2, 3, 3.0);
}