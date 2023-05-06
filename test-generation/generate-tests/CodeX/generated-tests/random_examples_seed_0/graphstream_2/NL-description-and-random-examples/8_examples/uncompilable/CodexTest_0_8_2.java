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


public class CodexTest_0_8_2 { 
  @Test
    public void testEqualsPath() {
		Path p1 = new Path(new int[] { 5, 4, 1, 6 });
		Path p2 = new Path(new int[] { 5, 4, 1, 6 });
		assertEquals(true, p1.equals(p2));
	}
}