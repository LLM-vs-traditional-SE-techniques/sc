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


public class CodexTest_0_4_29 { 
  @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        path1.setRoot(graph.getNode(a));
        path2.setRoot(graph.getNode(a));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(ab));
        path2.add(graph.getEdge(ab));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(bc));
        path2.add(graph.getEdge(bc));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(cd));
        path2.add(graph.getEdge(cd));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(de));
        path2.add(graph.getEdge(de));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(ef));
        path2.add(graph.getEdge(ef));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(fg));
        path2.add(graph.getEdge(fg));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(gh));
        path2.add(graph.getEdge(gh));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(hi));
        path2.add(graph.getEdge(hi));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(ij));
        path2.add(graph.getEdge(ij));
        assertTrue(path1.equals(path2));
        path1.add(graph.getEdge(jk));
        path2.add(graph.getEdge(jk));
}