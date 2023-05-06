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


public class CodexTest_0_7_27 { 
  @Test
    public void testContains() {
			// given
			DefaultGraph graph = new DefaultGraph("test");
			graph.setStrict(false);
			graph.setAutoCreate(true);
			Vertex v1 = graph.addVertex("1");
			Vertex v2 = graph.addVertex("2");
			Edge e1 = graph.addEdge(null, v1, v2, "test");
			Edge e2 = graph.addEdge(null, v2, v1, "test2");
}