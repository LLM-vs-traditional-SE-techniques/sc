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


public class CodexTest_0_8_10 { 
  @Test
    public void testPathEquals() {
        final Graph graph = createSimpleGraph();
        final Path path1 = new Path();
        path1.setRoot(graph.getNode(a));
        path1.add(graph.getEdge(ab));
        path1.add(graph.getEdge(bc));
        path1.add(graph.getEdge(cd));
        String msg = "Path equals method is incorrect";
        Assert.assertTrue(msg, path1.equals(path1));
    }
}