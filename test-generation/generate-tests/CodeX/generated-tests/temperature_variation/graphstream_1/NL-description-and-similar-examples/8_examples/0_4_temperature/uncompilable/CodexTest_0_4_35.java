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


public class CodexTest_0_4_35 { 
    @Test
    public void contains() {
        Path path = new Path();
        path.add(new Edge(1, 2, 3));
        assertTrue(path.contains(new Edge(1, 2, 3)));
        assertFalse(path.contains(new Edge(1, 2, 4)));
    }
}