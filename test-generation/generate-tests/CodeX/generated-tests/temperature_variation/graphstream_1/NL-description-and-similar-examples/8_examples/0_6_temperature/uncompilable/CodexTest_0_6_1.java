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


public class CodexTest_0_6_1 { 
  @Test
  public void testContains() {
    // given
    Path path = new Path();
    path.add(new Edge(new Node("A"), new Node("B")));
    path.add(new Edge(new Node("B"), new Node("C")));
    path.add(new Edge(new Node("C"), new Node("D")));
    // when
    boolean result = path.contains(new Edge(new Node("A"), new Node("B")));
    // then
    assertTrue(result);
  }
}