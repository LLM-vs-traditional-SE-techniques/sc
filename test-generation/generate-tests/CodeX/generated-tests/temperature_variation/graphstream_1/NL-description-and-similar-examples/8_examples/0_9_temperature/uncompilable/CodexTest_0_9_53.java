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


public class CodexTest_0_9_53 { 
  @Test
    public void testContains() {
        DefaultDirectedWeightedGraph<Integer, DefaultWeightedEdge> g =
            new DefaultDirectedWeightedGraph<Integer, DefaultWeightedEdge>(DefaultWeightedEdge.class);
        DefaultWeightedEdge e12 = Graphs.addEdgeWithVertices(g, 1, 2, 10);
        int n = 10;
        for (int i = 0; i < n; i++) {
            Graphs.addEdgeWithVertices(g, 1, 0, i);
        }
        SingleSourcePaths<Integer, DefaultWeightedEdge> path =
            new DijkstraShortestPath<Integer, DefaultWeightedEdge>(g).getPaths(0);
        for (DefaultWeightedEdge e : g.edgeSet()) {
            if (e.equals(e12))
                assertTrue(path.contains(e));
        }
    }
}