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


public class CodexTest_0_6_27 { 
  @Test
    public void testEqualsObject() {
        // create two paths
        Path p = new Path();
        p.add(new DefaultNode("a"));
        p.add(new DefaultNode("b"));
        Path q = new Path();
        q.add(new DefaultNode("a"));
        q.add(new DefaultNode("b"));
        // check reflexivity
        Assert.assertTrue(p.equals(p));
        Assert.assertTrue(p.equals(q));
        Assert.assertTrue(q.equals(p));
        // check non nullity
        Assert.assertFalse(p.equals(null));
        // check symmetry
        p.add(new DefaultNode("c"));
        Assert.assertFalse(p.equals(q));
        Assert.assertFalse(q.equals(p));
    }
}