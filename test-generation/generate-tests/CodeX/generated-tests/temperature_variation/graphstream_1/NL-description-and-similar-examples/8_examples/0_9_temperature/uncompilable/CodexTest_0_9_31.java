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


public class CodexTest_0_9_31 { 
  @Test
  public static void testContains() {
		alg = new Path();
		alg.add(null, e1);
		alg.add(e1, e2);
		alg.add(e2, e3);
		assertTrue(alg.contains(e1));
		assertTrue(alg.contains(e2));
		assertTrue(alg.contains(e3));
	}
}