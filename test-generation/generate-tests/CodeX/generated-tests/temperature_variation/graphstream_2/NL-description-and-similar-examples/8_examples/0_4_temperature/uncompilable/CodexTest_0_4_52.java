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


public class CodexTest_0_4_52 { 
    @Test
    public void testEquals() {
        Path p = new Path();
        Graph graph = createSimpleGraph();
        p.setRoot(graph.getNode(a));
        p.add(graph.getEdge(ab));
        p.add(graph.getEdge(bc));
        p.add(graph.getEdge(cd));
        Assert.assertTrue(p.equals(p));
        Assert.assertFalse(p.equals(null));
        Assert.assertFalse(p.equals(graph));
    }
}