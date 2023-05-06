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


public class CodexTest_0_4_5 { 
  @Test
    public void testContains() {
        Path path = new Path();
        Edge edge1 = new Edge("1", "2");
        Edge edge2 = new Edge("2", "3");
        path.add(edge1);
        path.add(edge2);
        assertTrue(path.contains(edge1));
        assertTrue(path.contains(edge2));
    }
}