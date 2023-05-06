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


public class CodexTest_0_7_4 { 
    @Test
    public void testPathComparison() {
        Path p = new Path();
        p.add(new Node(1));
        p.add(new Node(2));
        p.add(new Node(3));
        Path p2 = p.clone();
        assertTrue(p.equals(p2));
}