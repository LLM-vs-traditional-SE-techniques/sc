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


public class CodexTest_0_8_5 { 
  @Test
    public void testHashCode() {
		Path p1 = new Path(1, 2, 3, 4, 5);
		Path p2 = new Path(1, 2, 3, 4, 5);
		assertEquals(p1.hashCode(), p2.hashCode());
		p1 = new Path(1, 2, 3, 4);
		assertNotSame(p1.hashCode(), p2.hashCode());
    }
}