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


public class CodexTest_0_9_60 { 
  @Test
  public void testEqualsWhenPathsDifferAtFirstNode() {
		Graph graph = createSimpleGraph();
		Path firstPath = new Path();
		Path secondPath = new Path();
		firstPath.setRoot(graph.getNode(a));
		secondPath.setRoot(graph.getNode(b));
		secondPath.add(graph.getEdge(bc));
		assertFalse(firstPath.equals(secondPath));
	}

}