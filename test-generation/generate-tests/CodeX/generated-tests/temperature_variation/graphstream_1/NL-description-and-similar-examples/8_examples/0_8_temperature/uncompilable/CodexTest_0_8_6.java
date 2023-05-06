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


public class CodexTest_0_8_6 { 
  @Test
  public void testContains() {
    BasicGraph g = new BasicGraph();
    Node n1 = new Node();
    Node n2 = new Node();
    g.addNode(n1);
    g.addNode(n2);
    Edge e1 = n1.addEdgeTo(n2);
    BasicPath path = new BasicPath(n1);
}