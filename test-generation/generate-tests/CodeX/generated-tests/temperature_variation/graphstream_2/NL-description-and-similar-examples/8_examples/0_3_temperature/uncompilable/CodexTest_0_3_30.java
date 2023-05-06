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


public class CodexTest_0_3_30 { 
  @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        assertTrue(path1.equals(path2));
        path1.add(graph.getNode(a));
        path2.add(graph.getNode(a));
        assertTrue(path1.equals(path2));
        path1.add(graph.getNode(b));
        path2.add(graph.getNode(b));
        assertTrue(path1.equals(path2));
        path1.add(graph.getNode(c));
        path2.add(graph.getNode(c));
        assertTrue(path1.equals(path2));
        path1.add(graph.getNode(d));
        path2.add(graph.getNode(d));
        assertTrue(path1.equals(path2));
        path1.add(graph.getNode(e));
        path2.add(graph.getNode(e));
        assertTrue(path1.equals(path2));
    }
}