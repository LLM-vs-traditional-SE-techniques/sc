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


public class CodexTest_0_7_29 { 
  @Test
    public void testContains() {
		Graph graph = new DefaultGraph("test");
		graph.setStrict(false);
		graph.setAutoCreate(true);
		graph.addEdge("ab", "a", "b");
		graph.addEdge("bc", "b", "c");
		graph.addEdge("cd", "c", "d");
		graph.addEdge("de", "d", "e");
		graph.addEdge("ef", "e", "f");
		graph.addEdge("eg", "e", "g");
		graph.addEdge("eh", "e", "h");
		graph.addEdge("ei", "e", "i");
		graph.addEdge("ij", "i", "j");
		graph.addEdge("ik", "i", "k");
}