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


public class CodexTest_0_7_21 { 
  @Test
	public void testContains_whenContains_thenReturnTrue() {
		// given
		Graph graph = new TinkerGraph();
		graph.addVertex("v1");
		graph.addVertex("v2");
		Edge edge = graph.addEdge("e1", "v1", "v2", "label");
		Path path = new Path();
		path.add(edge);
}