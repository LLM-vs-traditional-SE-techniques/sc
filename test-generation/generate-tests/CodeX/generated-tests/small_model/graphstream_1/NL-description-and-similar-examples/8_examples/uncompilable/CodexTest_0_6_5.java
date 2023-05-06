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


public class CodexTest_0_6_5 { 
  @Test
  public void testContains_whenEdgeIsAtTheEndOfPath_shouldReturnTrue() {
    AlgVector v = new AlgVector();
    Edge e1 = new Edge("source", "target", "name");
    Edge e2 = new Edge("source2", "target2", "name2");
    v.add(e1);
    v.add(e2);
    assertTrue(v.contains(e2));
  }
}