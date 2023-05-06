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


public class CodexTest_0_7_24 { 
    @Test
    public void testEquals() {
        Graph graph = new ListenableDirectedGraph(DefaultEdge.class);
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addEdge(a, b);
        graph.addEdge(b, c);
        Path path = new Path();
        path.setRoot(graph.getNode(a));
        path.add(graph.getEdge(ab));
        path.add(graph.getEdge(bc));
        assertEquals(path, path);
        
        Path path1 = new Path();
        path1.setRoot(graph.getNode(a));
        path1.add(graph.getEdge(ab));
        path1.add(graph.getEdge(bc));
        assertEquals(path, path1);
        
        Path path2 = new Path();
        path2.setRoot(graph.getNode(a));
        path2.add(graph.getEdge(ab));
        assertFalse(path.equals(path2));
        
        Path path3 = new Path();
        path3.setRoot(graph.getNode(a));
        path3.add(graph.getEdge(ab));
        path3.add(graph.getEdge(bc));
        path3.add(graph.getEdge(bc));
        assertFalse(path.equals(path3));
    }
}