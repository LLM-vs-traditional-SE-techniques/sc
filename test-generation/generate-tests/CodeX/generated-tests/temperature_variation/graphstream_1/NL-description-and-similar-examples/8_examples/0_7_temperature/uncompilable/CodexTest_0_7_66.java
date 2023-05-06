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


public class CodexTest_0_7_66 { 
    @Test
    public void testContainss() {
        BasicPath p = new BasicPath();
        Edge edge1 = new Edge();
        Edge edge2 = new Edge();
        p.add(edge1);
        assertTrue(p.contains(edge1));
        assertFalse(p.contains(edge2));
    }
}