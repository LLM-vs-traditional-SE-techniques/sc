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


public class CodexTest_0_8_42 { 
  @Test
	public void contains_whenEdgeNotInPath_shouldReturnFalse() {
		DefaultPath<Object, Edge> path = new DefaultPath<Object, Edge>("graph");
		Graph graph = new DefaultGraph("graph");
		String v1Id = "v1";
		String v2Id = "v2";
		String v3Id = "v3";
		graph.addVertex(v1Id);
		graph.addVertex(v2Id);
		graph.addVertex(v3Id);
		Edge edge1 = graph.addEdge(v1Id, v2Id, "edge1");
		Edge edge2 = graph.addEdge(v2Id, v3Id, "edge2");
		path.edgePath.add(edge1);
		assertThat(path.contains(edge2), is(false));
		path.edgePath.add(edge2);
		assertThat(path.contains(edge1), is(true));
		assertThat(path.contains(edge2), is(true));
	}
}