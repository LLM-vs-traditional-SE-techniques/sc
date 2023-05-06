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


public class CodexTest_0_9_1 { 
  @Test
  public void testContains() {
		Edge a1 = new Edge("a1");
		Edge a2 = new Edge("a2");
		Path p = new Path();
		p.add(a1);
		p.add(a2);
		assertTrue(p.contains(a2));
	}
}