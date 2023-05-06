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


public class CodexTest_0_4_7 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        Path p3 = new Path();
        p1.add(new Edge(new Node(), new Node()));
        p2.add(new Edge(new Node(), new Node()));
        p3.add(new Edge(new Node(), new Node()));
        p3.add(new Edge(new Node(), new Node()));
        Assert.assertTrue(p1.equals(p2));
        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p2.equals(p3));
    }
}