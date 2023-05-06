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


public class CodexTest_0_4_2 { 
  @Test
  public void testContainsEdge() {
			assertTrue(path.contains(graph.getEdge("a", "b")));
			assertTrue(path.contains(graph.getEdge("b", "c")));
			assertTrue(path.contains(graph.getEdge("c", "d")));
			assertTrue(path.contains(graph.getEdge("d", "e")));
			assertTrue(path.contains(graph.getEdge("e", "f")));
			assertTrue(path.contains(graph.getEdge("f", "g")));
			assertTrue(path.contains(graph.getEdge("g", "h")));
			assertTrue(path.contains(graph.getEdge("h", "i")));
			assertTrue(path.contains(graph.getEdge("i", "j")));
			assertTrue(path.contains(graph.getEdge("j", "k")));
			assertTrue(path.contains(graph.getEdge("k", "l")));
			assertTrue(path.contains(graph.getEdge("l", "m")));
			assertTrue(path.contains(graph.getEdge("m", "n")));
			assertTrue(path.contains(graph.getEdge("n", "o")));
			assertTrue(path.contains(graph.getEdge("o", "p")));
			assertTrue(path.contains(graph.getEdge("p", "q")));
			assertTrue(path.contains(graph.getEdge("q", "r")));
			assertTrue(path.contains(graph.getEdge("r", "s")));
			assertTrue(path.contains(graph.getEdge("s", "t")));
			assertTrue(path.contains(graph.getEdge("t", "u")));
			assertTrue(path.contains(graph.getEdge("u", "v")));
			assertTrue(path.contains(graph.getEdge("v", "w")));
			assertTrue(path.contains(graph.getEdge("w", "x")));
			assertTrue(path.contains(graph.getEdge("x", "y")));
			assertTrue(path.contains(graph.getEdge("y", "z")));
			assertTrue(path.contains
}