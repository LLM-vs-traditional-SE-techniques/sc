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


public class CodexTest_0_6_5 { 
  @Test
    public void testEquals() {
		Path p = new Path();
		p.add(3);
		p.add(4);
		p.add(5);
		Path p2 = new Path();
		p2.add(3);
		p2.add(4);
		p2.add(5);
		assertTrue(p.equals(p2));
		p2.add(6);
		assertFalse(p.equals(p2));
	}
}