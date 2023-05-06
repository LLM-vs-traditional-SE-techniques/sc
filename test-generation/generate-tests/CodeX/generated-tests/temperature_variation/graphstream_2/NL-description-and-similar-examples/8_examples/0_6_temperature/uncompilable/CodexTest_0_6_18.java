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


public class CodexTest_0_6_18 { 
  @Test
  public void testEquals() {
    final Path p = new Path();
    final Path p2 = new Path();
    final Graph g = createSimpleGraph();
    p.setRoot(g.getNode(a));
    p.add(g.getEdge(ab));
    p.add(g.getEdge(bc));
    p.add(g.getEdge(cd));
    p2.setRoot(g.getNode(a));
    p2.add(g.getEdge(ab));
    p2.add(g.getEdge(bc));
    p2.add(g.getEdge(cd));
    Assert.assertTrue(p.equals(p2));
  }

}