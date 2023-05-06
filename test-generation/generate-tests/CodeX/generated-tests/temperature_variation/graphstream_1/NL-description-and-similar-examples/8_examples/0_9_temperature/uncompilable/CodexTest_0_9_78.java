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


public class CodexTest_0_9_78 { 
  @Test
  public void testContains() {
  	Graph g = new ListenableDirectedGraph<Vertex, Edge>(Edge.class);
    Vertex v1 = new ConcreteVertex(1);
    Vertex v2 = new ConcreteVertex(2);
    Edge e1 = new ConcreteEdge(v1, v2);
    g.addVertex(v1);
    g.addVertex(v2);
    g.addEdge(v1, v2, e1);
    Path path = new Path(e1);
    assertTrue(path.contains(e1));
    assertFalse(path.contains(g.getEdge(v2, v1)));
  }
}