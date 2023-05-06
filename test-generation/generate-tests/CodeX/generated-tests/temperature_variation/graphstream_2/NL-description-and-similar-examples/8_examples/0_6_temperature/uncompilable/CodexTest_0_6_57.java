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


public class CodexTest_0_6_57 { 
  @Test
    public void testEquals() {
    Path p = new Path();
    p.add(g.getNode("A"));
    p.add(g.getEdge("AB"));
    p.add(g.getNode("B"));
    Path p2 = new Path();
    p2.add(g.getNode("A"));
    p2.add(g.getEdge("AB"));
    p2.add(g.getNode("B"));
    assertTrue(p.equals(p2));
  }
}