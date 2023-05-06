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


public class CodexTest_0_9_5 { 
  @Test
    public void testContainsEdge() {
      Graph graph = create();
      String s1 = "a";
      String s2 = "b";
      String s3 = "c";
      String s4 = "d";
      String s5 = "e";
      graph.addVertex(s1);
      graph.addVertex(s2);
      graph.addEdge(s3, s1, s2);
      graph.addEdge(s4, s2, s1);
      graph.addEdge(s5, s3, s4);
}