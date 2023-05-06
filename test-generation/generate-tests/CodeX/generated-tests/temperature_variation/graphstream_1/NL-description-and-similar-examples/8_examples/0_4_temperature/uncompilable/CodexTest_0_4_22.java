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


public class CodexTest_0_4_22 { 
  @Test
	public void contains_whenContainsEdge_thenReturnTrue() {
		// given
		Path path = new Path();
		path.edgePath.add(new Edge("A", "B", 1));
		// when
		boolean result = path.contains(new Edge("A", "B", 1));
		// then
		assertTrue(result);
	}
}