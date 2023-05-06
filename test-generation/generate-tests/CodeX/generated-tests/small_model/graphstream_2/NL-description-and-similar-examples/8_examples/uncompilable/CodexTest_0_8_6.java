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
  public void testEquals() {
    Graph g = new DefaultGraph("foo");
    Node n1 = g.addNode("n1");
    Node n2 = g.addNode("n2");
    Node n3 = g.addNode("n3");
    Edge e1 = g.addEdge("e1", n1, n2);
    Edge e2 = g.addEdge("e2", n2, n
}