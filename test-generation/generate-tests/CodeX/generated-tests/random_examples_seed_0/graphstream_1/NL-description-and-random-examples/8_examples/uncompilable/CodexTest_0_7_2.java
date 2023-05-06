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
  public static void testContainsEdge() {
      Edge edge1 = new Edge("a", "b", 1.0);
      Edge edge2 = new Edge("a", "c", 2.0);
      List<Edge> edgeList = new LinkedList<Edge>();
      edgeList.add(edge1);
      edgeList.add(edge2);
}