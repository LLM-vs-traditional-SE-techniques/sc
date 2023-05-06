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


public class CodexTest_0_6_15 { 
    @Test
    public void testContainsEdge() {
        Edge edge = new Edge();
        Path path = new Path();
        path.add(edge);
        boolean result = path.contains(edge);
        Assert.assertTrue(result);
    }
}