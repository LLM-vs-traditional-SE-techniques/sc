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


public class CodexTest_0_9_10 { 
  @Test
    public void testEqualityOfPaths () {
        Path p1 = createPath("a", "a", "a");
        Path p2 = createPath("a", "a", "a");
        Path p3 = createPath("a", "a");
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
        assertFalse(p3.equals(p1));
    }

}