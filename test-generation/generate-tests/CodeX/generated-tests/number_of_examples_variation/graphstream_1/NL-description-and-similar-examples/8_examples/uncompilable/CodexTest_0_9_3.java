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
  public void testContainsExists() {
            Graph g = new DefaultGraph("test");
            g.addVertex("A");
            g.addVertex("B");
            g.addVertex("C");
            g.addEdge("AB", "A", "B");
            g.addEdge("BC", "B", "C");
            Path p = new Path();
            p.add(g.getEdge("AB"));
            // 1. add own edge
            Edge e1 = g.getEdge("BC");
            p.add(e1);
}