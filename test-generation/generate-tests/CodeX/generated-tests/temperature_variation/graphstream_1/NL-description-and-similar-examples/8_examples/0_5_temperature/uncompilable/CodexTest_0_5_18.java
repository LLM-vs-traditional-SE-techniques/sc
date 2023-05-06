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


public class CodexTest_0_5_18 { 
  @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge("ab", "a", "b"));
        path.add(new Edge("bc", "b", "c"));
        path.add(new Edge("cd", "c", "d"));
        assertTrue(path.contains(new Edge("bc", "b", "c")));
    }
}