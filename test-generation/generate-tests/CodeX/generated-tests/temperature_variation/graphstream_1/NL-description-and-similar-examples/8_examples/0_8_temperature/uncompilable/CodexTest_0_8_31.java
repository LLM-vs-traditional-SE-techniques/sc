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


public class CodexTest_0_8_31 { 
    @Test
    public void testContains() {
        Path<String> path = new Path<String>("a", "b", "c");
        StringToEdge stoe = StringToEdge.getInstance();
        Edge ab = stoe.apply("a-b");
        Edge bc = stoe.apply("b-c");
        assertTrue(path.contains(ab));
        assertTrue(path.contains(bc));
        assertFalse(path.contains(stoe.apply("c-a")));
    }
}