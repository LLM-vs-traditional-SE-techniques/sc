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
  public void testContains() {
    Graph g = createGraph();
    Node a = g.addNode("a");
    Node b = g.addNode("b");
    Node c = g.addNode("c");
    Node d = g.addNode("d");
}