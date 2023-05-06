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


public class CodexTest_0_9_9 { 
  @Test
    public void testContains() {
		Edge edgeAB = new DefaultEdge();
		Edge edgeCD = new DefaultEdge();
		Path pathAB = new Path(edgeAB);
		
		assertTrue(pathAB.contains(edgeAB));
		assertFalse(pathAB.contains(edgeCD));
	}
}