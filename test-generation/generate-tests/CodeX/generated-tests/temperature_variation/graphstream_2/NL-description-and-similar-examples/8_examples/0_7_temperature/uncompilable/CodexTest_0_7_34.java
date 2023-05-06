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


public class CodexTest_0_7_34 { 
  @Test
  public void testEquals() {
    Path path = new Path();
    path.setRoot(graph.getNode(a));
    path.add(graph.getEdge(ab));
    path.add(graph.getEdge(bc));
    Path path2 = new Path();
    path2.setRoot(graph.getNode(a));
    path2.add(graph.getEdge(ab));
    path2.add(graph.getEdge(bc));
    assertTrue(path.equals(path2));
    assertTrue(path2.equals(path));
  }
}