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


public class CodexTest_0_3_31 { 
  @Test
    public void testEquals() {
        Path p = new Path();
        p.add(null, new DefaultEdge(ab));
        p.add(new DefaultNode(b), new DefaultEdge(bc));
        Path p2 = new Path();
        p2.add(null, new DefaultEdge(ab));
        p2.add(new DefaultNode(b), new DefaultEdge(bc));
        assertEquals(p, p2);
    }
}