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


public class CodexTest_0_8_46 { 
  @Test
    public void testEquals() {
		// prepare a simple graph
		Graph g = new DefaultGraph("g");
		g.addEdge("AB", "A", "B", true);
		g.addEdge("BC", "B", "C", true);
		g.addEdge("CD", "C", "D", true);
		g.addEdge("DE", "D", "E", true);
		g.addEdge("DA", "D", "A", true);
}