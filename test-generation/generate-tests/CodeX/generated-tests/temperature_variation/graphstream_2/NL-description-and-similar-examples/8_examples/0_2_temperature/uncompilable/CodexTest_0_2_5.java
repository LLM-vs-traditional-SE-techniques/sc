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


public class CodexTest_0_2_5 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        Assert.assertTrue(p1.equals(p2));
        p1.add(new Edge(new Node("a"), new Node("b")));
        Assert.assertFalse(p1.equals(p2));
        p2.add(new Edge(new Node("a"), new Node("b")));
        Assert.assertTrue(p1.equals(p2));
        p1.add(new Edge(new Node("b"), new Node("c")));
        Assert.assertFalse(p1.equals(p2));
        p2.add(new Edge(new Node("b"), new Node("c")));
        Assert.assertTrue(p1.equals(p2));
    }
}