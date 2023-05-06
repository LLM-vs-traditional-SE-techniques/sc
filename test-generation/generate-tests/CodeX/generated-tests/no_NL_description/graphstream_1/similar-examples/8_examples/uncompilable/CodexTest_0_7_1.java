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


public class CodexTest_0_7_1 { 
    @Test
    public void testContains() {
        Path p = SimplePath.makePath(new Vertex("A"), new Vertex("B"), new Vertex("C"));
        assertTrue("Path does not contain an edge it should", p.contains(new Vertex("B")));
        assertFalse("Path contains an edge it should not", p.contains(new Vertex("D")));
    }
}