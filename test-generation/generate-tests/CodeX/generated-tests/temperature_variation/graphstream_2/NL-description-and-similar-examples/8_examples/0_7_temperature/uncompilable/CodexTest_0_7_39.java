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


public class CodexTest_0_7_39 { 
    @Test
	public void testEquals_shouldReturnFalseWhenNodesAreDifferent() {
		// given
		Graph graph = createSimpleGraph();
		Path path1 = createPath(graph, a, b, c);
		Path path2 = createPath(graph, a, b, d);
		// then
		assertFalse(path1.equals(path2));
	}
}