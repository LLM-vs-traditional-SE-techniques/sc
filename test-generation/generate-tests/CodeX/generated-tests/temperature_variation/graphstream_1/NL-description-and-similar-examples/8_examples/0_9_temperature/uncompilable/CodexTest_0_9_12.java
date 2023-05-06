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


public class CodexTest_0_9_12 { 
    @Test
    public void testContains() {
        TestEdge e1 = new TestEdge(1, 2, 100);
        TestEdge e2 = new TestEdge(2, 3, 101);
        TestEdge e3 = new TestEdge(3, 4, 102);
        TestEdge e4 = new TestEdge(4, 4, 103);
        TestEdge e5 = new TestEdge(4, 4, 103);
        Path edgePath = new Path(e4, e3, e2, e1);
        assertTrue(edgePath.contains(e1));
        assertTrue(edgePath.contains(e2));
        assertTrue(edgePath.contains(e3));
        assertTrue(edgePath.contains(e4));
        assertTrue(edgePath.contains(e5));
        assertFalse(edgePath.contains(new TestEdge(2, 3, 101)));
    }

}