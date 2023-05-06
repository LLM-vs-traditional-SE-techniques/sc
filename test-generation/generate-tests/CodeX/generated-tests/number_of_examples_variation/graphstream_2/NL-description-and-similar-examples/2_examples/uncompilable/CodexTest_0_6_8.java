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


public class CodexTest_0_6_8 { 
  @Test
  /**
	 * Test method for {@link org.apache.commons.graph.Path#equals(org.apache.commons.graph.Path)}.
	 */
	public final void testEqualsPath() {
		Graph<String, DefaultWeightedEdge> graph = new DefaultDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);
		Graphs.addAllVertices(graph, Arrays.asList("a", "b", "c"));
		DefaultWeightedEdge e1 = graph.addEdge("a", "b");
		DefaultWeightedEdge e2 = graph.addEdge("b", "c");
		graph.setEdgeWeight(e1, 2d);
		graph.setEdgeWeight(e2, 3d);
}