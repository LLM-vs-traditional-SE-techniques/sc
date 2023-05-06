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


public class CodexTest_0_6_19 { 
  @Test
  public void testContainsEdge() {
      Path p = new Path();
      p.add(new Edge("a", "b"));
      p.add(new Edge("b", "c"));
      p.add(new Edge("c", "d"));
      assertTrue("Path should contain edge", p.contains(new Edge("b", "c")));
      assertFalse("Path should not contain edge", p.contains(new Edge("d", "c")));
  }
}