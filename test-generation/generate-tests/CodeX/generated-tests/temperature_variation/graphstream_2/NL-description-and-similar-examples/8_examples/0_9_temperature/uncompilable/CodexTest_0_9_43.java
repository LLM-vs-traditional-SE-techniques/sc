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


public class CodexTest_0_9_43 { 
  @Test
    public void testEquals() {
        assertTrue(v1.equals(v1));
        assertTrue(v1.equals(v2));
        assertTrue(v2.equals(v1));
        assertTrue(v2.equals(v2));
        assertTrue(! v1.equals(v3));
        assertTrue(! v3.equals(v1));
        assertTrue(! v2.equals(v3));
        assertTrue(! v3.equals(v2));
    }
}