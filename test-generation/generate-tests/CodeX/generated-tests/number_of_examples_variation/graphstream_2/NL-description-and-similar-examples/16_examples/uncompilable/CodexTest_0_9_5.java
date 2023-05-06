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
	public void equals_pathsShouldBeEqual() {
		// given
		Graph graph = createSimpleGraph();
		Path path1 = graph.getPath(graph.getNode(a), graph.getNode(d));
		Path path2 = graph.getPath(graph.getNode(a), graph.getNode(d));
		
		// when
		boolean result = path1.equals(path2);
		
		// then
		assertTrue(result);
	}

}