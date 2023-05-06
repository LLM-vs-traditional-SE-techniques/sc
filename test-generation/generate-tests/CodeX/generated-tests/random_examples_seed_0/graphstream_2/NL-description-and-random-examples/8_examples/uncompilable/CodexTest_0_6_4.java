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


public class CodexTest_0_6_4 { 
  @Test
    public void testEquals() {
		Path p = new Path(1, 2, 3);
		assertTrue(p.equals(new Path(1, 2, 3)));
		assertFalse(p.equals(new Path(1, 2, 4)));
		assertFalse(p.equals(new Path(1, 2)));
	}
}