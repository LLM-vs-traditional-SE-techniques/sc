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
    public void testContains() {
        EdgePath path = new EdgePath();
        assertFalse(path.contains(new Edge(1, 2)));
        path.add(new Edge(1, 2));
        assertTrue(path.contains(new Edge(1, 2)));
        assertFalse(path.contains(new Edge(2, 3)));
    }
}