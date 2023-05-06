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


public class CodexTest_0_8_85 { 
  @Test
  public void contains() {
    final Edge e1 = edgeFactory.createEdge(v1, v2);
    final Edge e2 = edgeFactory.createEdge(v2, v3);
    final Edge e3 = edgeFactory.createEdge(v3, v1);
    final Edge e4 = edgeFactory.createEdge(v2, v1);
}