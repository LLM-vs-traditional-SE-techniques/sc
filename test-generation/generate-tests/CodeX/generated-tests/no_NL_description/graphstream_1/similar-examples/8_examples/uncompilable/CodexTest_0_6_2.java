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


public class CodexTest_0_6_2 { 
  @Test
    public void testContains() {
        Path path = new Path();
        Edge e1 = new Edge("1", "2", "3");
        Edge e2 = new Edge("4", "5", "6");
        path.add(e1);
        assertTrue(path.contains(e1));
        assertFalse(path.contains(e2));
    }
}