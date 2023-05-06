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


public class CodexTest_0_8_9 { 
  @Test
    public void testContainsEdge() {
      List<String> vertices = new LinkedList<String>();
      vertices.add("v0");
      vertices.add("v1");
      vertices.add("v2");
      vertices.add("v3");
      Graph graph = new DefaultGraph("test");
      graph.setStrict(false);
      graph.setAutoCreate(true);
      graph.addVertices(vertices);
      graph.addEdge("e1", "v0", "v1");
      graph.addEdge("e2", "v1", "v2");
      graph.addEdge("e3", "v2", "v3");
      EdgePath path = new EdgePath();
      path.add(graph.getEdge("e2"));
      path.add(graph.getEdge("e3"));
}