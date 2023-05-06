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


public class CodexTest_0_7_37 { 
  @Test
    public void testEquals() {
			DefaultDirectedGraph<String, DefaultEdge> g1 = new DefaultDirectedGraph<>(DefaultEdge.class);
		g1.addVertex("v1");
		g1.addVertex("v2");
		DefaultEdge e1 = g1.addEdge("v1", "v2");
		Path<String, DefaultEdge> p1 = new Path<>("v1", "v2", e1);
		Path<String, DefaultEdge> p2 = new Path<>("v1", "v2", e1);
}