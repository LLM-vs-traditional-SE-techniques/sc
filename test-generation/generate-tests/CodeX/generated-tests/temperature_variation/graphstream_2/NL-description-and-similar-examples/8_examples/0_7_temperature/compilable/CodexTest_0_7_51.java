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


public class CodexTest_0_7_51 { 
    @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        assertTrue(path1.equals(path2));
        Graph graph = new DefaultGraph("test");
        graph.addNode("1");
        graph.addNode("2");
        graph.addNode("3");
        graph.addEdge("1-2", "1", "2");
        graph.addEdge("2-3", "2", "3");
        graph.addEdge("3-1", "3", "1");
        path1.setRoot(graph.getNode("1"));
        path1.add(graph.getEdge("1-2"));
        path1.add(graph.getEdge("2-3"));
        path1.add(graph.getEdge("3-1"));
        path2.setRoot(graph.getNode("1"));
        path2.add(graph.getEdge("1-2"));
        path2.add(graph.getEdge("2-3"));
        path2.add(graph.getEdge("3-1"));
        assertTrue(path1.equals(path2));
    }
}