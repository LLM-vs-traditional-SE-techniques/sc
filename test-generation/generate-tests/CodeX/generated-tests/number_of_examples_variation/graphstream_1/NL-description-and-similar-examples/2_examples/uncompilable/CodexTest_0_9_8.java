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


public class CodexTest_0_9_8 { 
  @Test
    public void testContains() {
		Edge<String> edge = new ObjectEdge<String>("ab", "a", "b");
		List<Edge> edgePath = new ArrayList<Edge>();
		edgePath.add(edge);
		Path path = new Path();
		path.setEdgePath(edgePath);
}