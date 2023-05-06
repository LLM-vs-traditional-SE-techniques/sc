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


public class CodexTest_0_9_64 { 
    @Test
    public void testEquals2() {
        Path path1 = new Path();
        path1.add(g.getNode(a));
        path1.add(g.getEdge(ab));
        path1.add(g.getNode(b));
        path1.add(g.getNode(c));
        path1.add(g.getNode(d));
}