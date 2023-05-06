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


public class CodexTest_0_5_12 { 
  @Test
  public void testEquals() {
        Path p1 = new Path();
        p1.setRoot(new Node("a"));
        p1.add(new Edge("a", "b"));
        p1.add(new Edge("b", "c"));
        p1.add(new Edge("c", "d"));
        Path p2 = new Path();
        p2.setRoot(new Node("a"));
        p2.add(new Edge("a", "b"));
        p2.add(new Edge("b", "c"));
        p2.add(new Edge("c", "d"));
        Assert.assertTrue(p1.equals(p2));
    }
}