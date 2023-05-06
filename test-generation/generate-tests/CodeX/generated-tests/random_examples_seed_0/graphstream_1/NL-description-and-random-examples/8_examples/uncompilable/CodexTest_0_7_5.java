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


public class CodexTest_0_7_5 { 
  @Test
      public void testContains() {
        EdgePath edgePath1 = new EdgePath(new Edge(2, 3, 2));
        edgePath1.edgePath.add(new Edge(5, 6, 2));
        Edge edge = new Edge(5, 6, 2);
        assertTrue(edgePath1.contains(edge));
    }
}