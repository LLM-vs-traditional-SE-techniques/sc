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


public class CodexTest_0_6_22 { 
  @Test
  public void testContains() {
    Path p = new Path();
    p.add(new Edge("1", "a", "b"));
    p.add(new Edge("2", "b", "c"));
    p.add(new Edge("3", "c", "d"));
    assertTrue(p.contains(new Edge("1", "a", "b")));
    assertTrue(p.contains(new Edge("2", "b", "c")));
    assertTrue(p.contains(new Edge("3", "c", "d")));
    assertFalse(p.contains(new Edge("4", "a", "b")));
    assertFalse(p.contains(new Edge("5", "b", "a")));
  }
}