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


public class CodexTest_0_8_49 { 
  @Test
  public void testContains() {
    DefaultDirectedGraph<String, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);
    String v1 = "v1";
    String v2 = "v2";
    String v3 = "v3";
    DefaultEdge e1 = g.addEdge(v1, v2);
    DefaultEdge e2 = g.addEdge(v2, v3);
    DefaultEdge e3 = g.addEdge(v3, v1);
    Path<String, DefaultEdge> p1 = new Path<>(g, v1, v3);
    assertFalse(p1.contains(e2));
    assertFalse(p1.contains(e3));
    assertTrue(p1.contains(e1));
  }
}