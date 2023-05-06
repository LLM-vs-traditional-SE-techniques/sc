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


public class CodexTest_0_8_5 { 
  @Test
  public void testContains() {
    Path path = new Path();
    Graph graph = new DefaultGraph("test");
    graph.setStrict(false);
    graph.setAutoCreate(true);
    path.add(graph.addVertex("A"));
    path.add(graph.addVertex("B"));
    path.add(graph.addVertex("C"));
    Edge e = graph.addEdge("A-B", "A", "B");
    boolean contains = path.contains(e);
    assertTrue(contains);
  }
}