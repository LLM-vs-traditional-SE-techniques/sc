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


public class CodexTest_0_6_1 { 
  @Test
    public void testPathWithOneEdge() {
        // create a new path that is a path with one edge
        Path path = new Path();
        path.add(e1);
        path.add(e2);
        path.add(e1);
        // test whether path contains edge e1
        assertTrue(path.contains(e1));
    }
}