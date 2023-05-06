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


public class CodexTest_0_6_1 { 
  @Test
    public void testEquals() {
        Path p = createPath();
        Path q = createPath();
        assertTrue(p.equals(p));
        assertTrue(p.equals(q));
        assertTrue(q.equals(p));
        assertTrue(q.equals(q));
        assertFalse(p.equals(null));
        assertFalse(p.equals(new Object()));
        Path r = createPath();
        r.add(nodePath.peek(), null);
        assertFalse(p.equals(r));
    }
}