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


public class CodexTest_0_8_73 { 
  @Test
  public void testContains() {
			Edge e1 = new Edge(node1, node2, 7);
			graph.addEdge(e1);
			edgePath.add(e1);
			Assert.assertTrue(edgePath.contains(e1));
		}
}