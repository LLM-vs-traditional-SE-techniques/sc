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


public class CodexTest_0_8_75 { 
  @Test
  public void testEquals() {
        Path p = new Path();
        Assert.assertFalse(p.equals(null));
        Assert.assertTrue(p.equals(p));
        Assert.assertFalse(p.equals(""));
        Path q = new Path();
        Assert.assertTrue(p.equals(q));
        p.add(new Edge(null, null));
        Assert.assertFalse(p.equals(q));
        q.add(new Edge(null, null));
        Assert.assertTrue(p.equals(q));
  }
}