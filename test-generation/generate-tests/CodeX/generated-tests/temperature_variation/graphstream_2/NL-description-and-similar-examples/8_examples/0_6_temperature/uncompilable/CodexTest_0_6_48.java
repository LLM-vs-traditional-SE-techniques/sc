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


public class CodexTest_0_6_48 { 
  @Test
    public void testEquality() {
        Path p = new Path();
        p.add(graph.getEdge(ab));
        p.add(graph.getEdge(bc));
        p.add(graph.getEdge(cd));
        assertEquals(path, p);
    }
}