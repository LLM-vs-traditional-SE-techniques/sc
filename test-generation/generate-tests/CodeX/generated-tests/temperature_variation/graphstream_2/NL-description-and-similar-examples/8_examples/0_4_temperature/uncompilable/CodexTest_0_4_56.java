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


public class CodexTest_0_4_56 { 
  @Test
    public void testEquals() {
        Path p = new Path();
        p.add(graph.getEdge("ab"));
        p.add(graph.getEdge("bc"));
        p.add(graph.getEdge("cd"));
        Path p2 = new Path();
        p2.add(graph.getEdge("ab"));
        p2.add(graph.getEdge("bc"));
        p2.add(graph.getEdge("cd"));
        assertTrue("paths are equal", p.equals(p2));
    }
}