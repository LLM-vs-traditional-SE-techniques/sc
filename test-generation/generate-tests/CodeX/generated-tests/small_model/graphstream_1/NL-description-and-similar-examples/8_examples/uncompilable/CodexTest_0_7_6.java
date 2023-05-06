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


public class CodexTest_0_7_6 { 
  @Test
    public void testContainsEdge() {
				assertEquals(graph.getEdge("ab"), path.get(0));
				assertEquals(graph.getEdge("bc"), path.get(1));
				assertEquals(graph.getEdge("cd"), path.get(2));
				assertEquals(graph.getEdge("de"), path.get(3));
			}
}