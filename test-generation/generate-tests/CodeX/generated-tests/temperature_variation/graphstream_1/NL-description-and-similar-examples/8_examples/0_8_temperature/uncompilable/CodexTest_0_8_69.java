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


public class CodexTest_0_8_69 { 
  @Test
  public void testContains() {
		Path path = new Path();
		path.add(edge);
		path.add(edge2);
		assertTrue(path.contains(edge));
		assertFalse(path.contains(new DefaultEdge("dummy", "y", "z")));
  }
```
}