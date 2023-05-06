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


public class CodexTest_0_6_8 { 
    @Test
    public void testContains() {
        final DirectedEdge edge = new DirectedEdge(1, 2);
        final DirectedEdge edge2 = new DirectedEdge(2, 3);
        final DirectedEdge edge3 = new DirectedEdge(3, 4);
}