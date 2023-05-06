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


public class CodexTest_0_4_1 { 
  @Test
        public void testEqualPaths() {
		Path p1 = new Path();
		p1.addNode(0);
		p1.addNode(1);
		Path p2 = new Path();
		p2.addNode(0);
		p2.addNode(1);
		assertTrue(p1.equals(p2));
	}
}