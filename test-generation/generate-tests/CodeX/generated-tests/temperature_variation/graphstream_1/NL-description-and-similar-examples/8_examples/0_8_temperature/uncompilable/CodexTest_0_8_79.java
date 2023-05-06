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


public class CodexTest_0_8_79 { 
    @Test
    public void testContainsEdge() {
        Path path = new Path();
        DummyEdge edge = new DummyEdge("a", "b");
        assertFalse(path.contains(edge));
        path.edgePath.add(edge);
        assertTrue(path.contains(edge));
    }
}