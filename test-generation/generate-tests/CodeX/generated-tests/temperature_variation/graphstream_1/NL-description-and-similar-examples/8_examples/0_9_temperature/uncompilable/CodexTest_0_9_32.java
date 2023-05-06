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


public class CodexTest_0_9_32 { 
  @Test
	@Parameters(value = {"diagonal", "cross", "ladder", "switchback"})
	public void pathContainsEdges(String name, Graph graph) {
		Path path = graph.getPath(graph.getVertex("n0"), graph.getVertex("n7"));
		Node[] nodes = path.getNodePath().toArray(new Node[0]);
		Edge[] edges = path.getEdgePath().toArray(new Edge[0]);
}