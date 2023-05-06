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


public class CodexTest_0_5_4 { 
  @Test
    public void testEqualPaths() {
        Path p1 = new Path();
        Path p2 = new Path();
        p1.add(new Edge("ab", new Node("a"), new Node("b")));
        p1.add(new Edge("bc", new Node("b"), new Node("c")));
        p1.add(new Edge("cd", new Node("c"), new Node("d")));
        p2.add(new Edge("ab", new Node("a"), new Node("b")));
        p2.add(new Edge("bc", new Node("b"), new Node("c")));
        p2.add(new Edge("cd", new Node("c"), new Node("d")));
        Assert.assertTrue(p1.equals(p2));
    }
}