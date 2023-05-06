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


public class CodexTest_0_8_7 { 
  @Test
  public void testContains() {
    Edge edge1 = new DefaultEdge("ab", "a", "b", EdgeType.DIRECTED);
    Edge edge2 = new DefaultEdge("bc", "b", "c", EdgeType.DIRECTED);
    graph.addEdge(edge1);
    graph.addEdge(edge2);
}