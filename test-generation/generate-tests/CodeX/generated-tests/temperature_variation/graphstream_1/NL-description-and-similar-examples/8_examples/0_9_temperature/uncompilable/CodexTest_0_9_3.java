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


public class CodexTest_0_9_3 { 
  @Test
  public void testContains() {
      Set<String> edgeSet = new HashSet<Edge>();
      Graph graph = new DefaultGraph("TestGraph");
      graph.addEdge("E1", "v1", "v2");
      graph.addEdge("E2", "v2", "v3");
      Edge e1 = graph.getEdge("E1");
      Edge e2 = graph.getEdge("E2");
      Path p = new Path();
      edgeSet.add(e1);
      p.setEdgeSet(edgeSet);
      assertTrue("expected true but got false", p.contains("E1"));
      assertFalse("expected false but got true", p.contains("E2"));
  }
}