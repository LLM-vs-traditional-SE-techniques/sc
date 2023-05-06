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


public class CodexTest_0_7_92 { 
   @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        Assert.assertTrue(p1.equals(p1));
        Assert.assertTrue(p2.equals(p2));
        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p1));
        p1.add(new WeightedEdge(null, null, 20));
        Assert.assertFalse(p1.equals(p2));
        Assert.assertFalse(p2.equals(p1));
        p2.add(new WeightedEdge(null, null, 20));
        Assert.assertTrue(p1.equals(p1));
        Assert.assertTrue(p2.equals(p2));
        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p1));
        p1.add(new WeightedEdge(null, null, 5));
        Assert.assertFalse(p1.equals(p2));
        Assert.assertFalse(p2.equals(p1));
}