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


public class CodexTest_0_6_34 { 
  @Test
    public void testContains() throws Exception {
        Path path = new Path();
        path.add(new Edge("1", "2", "3"));
        path.add(new Edge("4", "5", "6"));
        assertFalse(path.contains(new Edge("7", "8", "9")));
        assertTrue(path.contains(new Edge("4", "5", "6")));
    }
}