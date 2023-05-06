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


public class CodexTest_0_5_46 { 
  @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        path1.setRoot(graph.getNode(a));
        path2.setRoot(graph.getNode(a));
        // no edges, so paths are equal
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(ab));
        path1.add(graph.getEdge(bc));
        path2.add(graph.getEdge(ab));
        path2.add(graph.getEdge(bc));
        // same edges, so paths are equal
        assertTrue(path1.equals(path2));
        path2.add(graph.getEdge(cd));
        // different lengths, so paths are not equal
        assertFalse(path1.equals(path2));
        path1.add(graph.getEdge(cd));
        path2.add(graph.getEdge(de));
        // same lengths, but different edges, so paths are not equal
        assertFalse(path1.equals(path2));
    }
}