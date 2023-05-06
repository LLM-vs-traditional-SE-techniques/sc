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


public class CodexTest_0_9_6 { 
  @Test
  public void testAddEdge_notInGraphFalse() {
    WeightedDirectedGraph<String, String> g = createOneWayGraph();
    String v1 = EDGE_01;
    String v2 = EDGE_02;
    String e1 = "Edge1";
}