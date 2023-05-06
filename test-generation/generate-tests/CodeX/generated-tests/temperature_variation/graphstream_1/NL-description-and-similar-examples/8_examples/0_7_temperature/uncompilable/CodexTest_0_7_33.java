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


public class CodexTest_0_7_33 { 
  @Test
        public void testContainsEdge() {
                DirectedGraph<Vertex, Edge> graph = new DirectedSparseMultigraph<Vertex, Edge>();
                Vertex v1 = new Vertex("1");
                Vertex v2 = new Vertex("2");
                Edge e = new Edge("ab", v1, v2);
                graph.addEdge(e, v1, v2);
                Path<Vertex, Edge> path = new Path<Vertex, Edge>();
                path.addEdge(e);
                assertTrue(path.contains(e));
        }
}