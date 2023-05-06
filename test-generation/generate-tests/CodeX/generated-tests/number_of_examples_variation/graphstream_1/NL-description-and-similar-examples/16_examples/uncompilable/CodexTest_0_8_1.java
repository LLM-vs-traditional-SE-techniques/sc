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


public class CodexTest_0_8_1 { 
    @Test(expected = IllegalArgumentException.class)
    public void getPathTo_errorWhenNotFound() throws Exception {
        Graph graph = new TinkerGraph();
        Vertex a = graph.addVertex("1");
        Vertex b = graph.addVertex("2");
        Vertex c = graph.addVertex("3");
        Vertex d = graph.addVertex("4");
        Vertex e = graph.addVertex("5");
        Vertex f = graph.addVertex("6");
        Edge edge1 = graph.addEdge(null, a, b, graph.getEdgeLabel());
        Edge edge2 = graph.addEdge(null, b, c, graph.getEdgeLabel());
        Edge edge3 = graph.addEdge(null, c, d, graph.getEdgeLabel());
        Edge edge4 = graph.addEdge(null, d, e, graph.getEdgeLabel());
        Edge edge5 = graph.addEdge(null, e, f, graph.getEdgeLabel());
        Edge edge6 = graph.addEdge(null, f, a, graph.getEdgeLabel());
        Set<Edge> set = new HashSet<Edge>();
        set.add(edge1);
        set.add(edge2);
        set.add(edge3);
        Path path = new Path();
        path.addAll(set);
        path.contains(edge4);
    }
}