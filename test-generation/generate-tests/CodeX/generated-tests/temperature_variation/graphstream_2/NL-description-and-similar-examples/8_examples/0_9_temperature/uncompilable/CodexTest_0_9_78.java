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


public class CodexTest_0_9_78 { 
  @Test
        	public void equalsTest1() {
        		Graph graph = createSimpleGraph();
        		Path path = new Path();
        			path.setRoot(graph.getNode(a));
        			path.add(graph.getEdge(ab));
        			path.add(graph.getEdge(bc));
        		Path path1 = new Path();
        			path1.setRoot(graph.getNode(z));
        			path1.add(graph.getEdge(bc));
        			path.add(graph.getEdge(bc));
        		Assert.assertFalse(path.equals(path1));
        	}

}