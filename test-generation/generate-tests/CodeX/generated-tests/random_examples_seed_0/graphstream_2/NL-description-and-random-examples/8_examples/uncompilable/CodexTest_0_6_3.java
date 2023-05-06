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


public class CodexTest_0_6_3 { 
  @Test
    public void testEqualityOfPathsWithSameNodes() {
		ArrayList<Integer> nodes1 = new ArrayList<Integer>();
		nodes1.add(0);
		nodes1.add(1);
		nodes1.add(2);
		Path p1 = new Path(nodes1);
		ArrayList<Integer> nodes2 = new ArrayList<Integer>();
		nodes2.add(0);
		nodes2.add(1);
		nodes2.add(2);
		Path p2 = new Path(nodes2);
		assertTrue(p1.equals(p2));
	}
}