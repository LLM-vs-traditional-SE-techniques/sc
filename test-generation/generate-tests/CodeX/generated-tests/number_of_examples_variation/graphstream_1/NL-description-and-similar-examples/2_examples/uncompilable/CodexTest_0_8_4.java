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


public class CodexTest_0_8_4 { 
    @Test
    public void correctTest(){
        Graph graph = new DefaultGraph("alternate");
        Vertex v1 = new DefaultVertex();
        Vertex v2 = new DefaultVertex();
        Vertex v3 = new DefaultVertex();
        Edge e1 = new DefaultEdge(v1, v2);
        Edge e2 = new DefaultEdge(v2, v3);
        Edge e3 = new DefaultEdge(v1, v3);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addEdge(e1);
        graph.addEdge(e2);
        Path path = new Path(graph);
        path.add(e1);
        assertEquals(true, path.contains(e1));
    }
}