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


public class CodexTest_0_8_9 { 
    @Test
    public void testEqualPaths() {
        Path p0 = new Path();
        Path p1 = new Path();
        Assert.assertTrue(p0.equals(p1));
        p0.add(createGraph().createNode(a));
        Assert.assertFalse(p0.equals(p1));
        p1.add(createGraph().createNode(a));
        Assert.
}