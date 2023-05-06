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


public class CodexTest_0_8_56 { 
  @Test
    public void testContains_whenEdgeHelpIsNotInPath() {
		// given
		DirectedGraph<Vertex, Edge> directedGraph = createSimpleDirectedGraph();
		Path<Vertex, Edge> path = createPath(directedGraph);
		// when
		final boolean result = path.contains(directedGraph.getEdge("1-2"));
		// then
		assertFalse(result);
	}
}