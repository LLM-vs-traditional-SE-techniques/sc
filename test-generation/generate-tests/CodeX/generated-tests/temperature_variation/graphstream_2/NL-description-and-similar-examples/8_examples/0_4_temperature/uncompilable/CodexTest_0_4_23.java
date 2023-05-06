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


public class CodexTest_0_4_23 { 
    @Test
    public void testEquals() {
        Path path = new Path();
        path.setRoot(graph.getNode(1));
        path.add(graph.getEdge(1, 2));
        path.add(graph.getEdge(2, 3));
        path.add(graph.getEdge(3, 4));
        path.add(graph.getEdge(4, 5));
        path.add(graph.getEdge(5, 6));
        path.add(graph.getEdge(6, 7));
        path.add(graph.getEdge(7, 8));
        path.add(graph.getEdge(8, 9));
        path.add(graph.getEdge(9, 10));
        path.add(graph.getEdge(10, 11));
        Path path2 = new Path();
        path2.setRoot(graph.getNode(1));
        path2.add(graph.getEdge(1, 2));
        path2.add(graph.getEdge(2, 3));
        path2.add(graph.getEdge(3, 4));
        path2.add(graph.getEdge(4, 5));
        path2.add(graph.getEdge(5, 6));
        path2.add(graph.getEdge(6, 7));
        path2.add(graph.getEdge(7, 8));
        path2.add(graph.getEdge(8, 9));
        path2.add(graph.getEdge(9, 10));
        path2.add(graph.getEdge(10, 11));
        assertTrue(path.equals(path2));
    }
}