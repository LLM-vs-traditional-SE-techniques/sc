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


public class CodexTest_0_7_2 { 
  @Test
  public void testEdgePathContains() {
    EdgePath edgePath = new EdgePath();
    Edge edge = new Edge(new Node("a"), new Node("b"), "label");
    edgePath.add(edge);
    assertTrue("EdgePath contains edge", edgePath.contains(edge));
  }
  public void testEdgePathNotContains() {
    EdgePath edgePath = new EdgePath();
    Edge edgeA = new Edge(new Node("a"), new Node("b"), "label");
    Edge edgeB = new Edge(new Node("c"), new Node("d"), "label");
    edgePath.add(edgeA);
    assertFalse("EdgePath contains edge", edgePath.contains(edgeB));
  }
}