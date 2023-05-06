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
   public void testContainsEdge() {
		Graph graph = new DefaultGraph("test");
		graph.setStrict(false);
		graph.setAutoCreate(true);
		Edge e1 = graph.addEdge("ab", "a", "b");
		Edge e2 = graph.addEdge("bc", "b", "c");
		Edge e3 = graph.addEdge("cd", "c", "d");
		Edge e4 = graph.addEdge("dc", "d", "c");
		Edge e5 = graph.addEdge("db", "d", "b");
		Edge e6 = graph.addEdge("ac", "a", "c");
		Edge e7 = graph.addEdge("bd", "b", "d");
		Edge e8 = graph.addEdge("ea", "e", "a");
		Path path = new Path();
		path.add(e2);
		path.add(e3);
		path.add(e4);
		path.add(e5);
		path.add(e7);
}