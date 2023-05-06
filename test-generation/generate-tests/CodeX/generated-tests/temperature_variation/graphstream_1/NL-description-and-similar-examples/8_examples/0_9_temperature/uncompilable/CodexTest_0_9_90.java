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


public class CodexTest_0_9_90 { 
  @Test
  public void testContainsEdge() {
    Path path = new Path();
    path.add(new Path.Edge("e1", "v1", "v2"));
    assertTrue(path.contains(new Path.Edge("e1", "v1", "v2")));
  }
}