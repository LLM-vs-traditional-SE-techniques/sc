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


public class CodexTest_0_6_24 { 
  @Test
    public void testEquals() {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Path p1 = new Path();
        p1.setRoot(a);
        p1.add(new Edge(a, b, 0));
        p1.add(new Edge(b, c, 0));
        Path p2 = new Path();
        p2.setRoot(a);
        p2.add(new Edge(a, b, 0));
        p2.add(new Edge(b, c, 0));
        Assert.assertTrue(p1.equals(p2));
    }
}