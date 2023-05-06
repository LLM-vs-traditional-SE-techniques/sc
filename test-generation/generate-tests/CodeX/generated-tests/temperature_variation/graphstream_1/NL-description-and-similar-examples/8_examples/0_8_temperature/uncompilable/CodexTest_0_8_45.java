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


public class CodexTest_0_8_45 { 
  @Test
    public void testContains() {
          Graph graph = Graph.create();
          Node node = graph.createNode("0");
          Node node1 = graph.createNode("1");
          Node node2 = graph.createNode("2");
          Node node3 = graph.createNode("3");
          node.createRelationshipTo(node1, "REL");
          node.createRelationshipTo(node2, "REL");
          node.createRelationshipTo(node3, "REL");
}