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


public class CodexTest_0_9_56 { 
  @Test
  public void testcontains(){
    Edge aEdge = new Edge();
    Edge bEdge = new Edge();
    EdgePath aEdgePath = new EdgePath();
    aEdgePath.add(aEdge);
    assertTrue(aEdgePath.contains(aEdge));
  }
}