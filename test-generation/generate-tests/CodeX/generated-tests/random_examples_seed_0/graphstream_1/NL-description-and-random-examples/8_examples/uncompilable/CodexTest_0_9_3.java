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
  public void testContains()
  {
    edgeList.add(new Edge(4,7));
    edgeList.add(new Edge(2,3));
    edgeList.add(new Edge(1,2));
    assertTrue(set1.contains(new Edge(1,2)));
    assertFalse(set1.contains(new Edge(1,7)));
  }
}