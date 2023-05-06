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


public class CodexTest_0_9_16 { 
  @Test
	public void testContainsEdge() {
		Graph g = TinkerGraph.open();
		g.addVertex(1);
		g.addVertex(2);
		Edge e = g.addEdge(3, 1, 2, "knows");
}