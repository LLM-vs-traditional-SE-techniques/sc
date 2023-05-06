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


public class CodexTest_0_8_51 { 
  @Test
  public void testContains() {
    Graph graph = new DefaultGraph(test);
    graph.setStrict(false);
    graph.setAutoCreate(true);
    graph.addEdge(ab, a, b);
    graph.addEdge(bc, b, c);
    graph.addEdge(cd, c, d);
    graph.addEdge(da, d, a);
    Path path = new Path();
    path.add(graph.getEdge(ab));
    path.add(graph.getEdge(bc));
    path.add(graph.getEdge(cd));
    path.add(graph.getEdge(da));
    assertTrue(abcda, path.contains(graph.getEdge(ab)));
    assertTrue(bcda, path.contains(graph.getEdge(bc)));
    assertTrue(cda, path.contains(graph.getEdge(cd)));
    assertTrue(da, path.contains(graph.getEdge(da)));
    assertFalse(a, path.contains(graph.getEdge(a)));
    assertFalse(b, path.contains(graph.getEdge(b)));
    assertFalse(c, path.contains(graph.getEdge(c)));
    assertFalse(d, path.contains(graph.getEdge(d)));
  }
}