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


public class CodexTest_0_4_3 { 
  @Test
  public void testContains() {
    EdgePath edgePath = new EdgePath();
    edgePath.add(new Edge("a", "b", "c"));
    edgePath.add(new Edge("b", "c", "d"));
    edgePath.add(new Edge("c", "d", "e"));
    assertTrue(edgePath.contains(new Edge("a", "b", "c")));
    assertFalse(edgePath.contains(new Edge("a", "b", "d")));
    assertFalse(edgePath.contains(new Edge("b", "a", "c")));
    assertFalse(edgePath.contains(new Edge("b", "c", "d")));
    assertFalse(edgePath.contains(new Edge("c", "b", "d")));
    assertFalse(edgePath.contains(new Edge("c", "d", "e")));
    assertFalse(edgePath.contains(new Edge("d", "c", "e")));
  }
}