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


public class CodexTest_0_4_74 { 
  @Test
    public void testEquals() {
        Path p = new Path();
        p.add(new Node("a"));
        p.add(new Node("b"));
        p.add(new Node("c"));
        Path p2 = new Path();
        p2.add(new Node("a"));
        p2.add(new Node("b"));
        p2.add(new Node("c"));
        assertTrue(p.equals(p2));
        p2.add(new Node("d"));
        assertFalse(p.equals(p2));
    }
}