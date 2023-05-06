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


public class CodexTest_0_5_8 { 
  @Test
  public void testContainsEdge() {
    Path path = new Path();
    Edge ab = new Edge("a", "b");
    Edge bc = new Edge("b", "c");
    path.add(ab);
    assertTrue(path.contains(ab));
    assertFalse(path.contains(bc));
  }
}