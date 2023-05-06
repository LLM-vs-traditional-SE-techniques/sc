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


public class CodexTest_0_4_3 { 
  @Test
    public void testEquals() {
        Path p = new Path();
        p.add(0);
        p.add(1);
        p.add(2);
        Path q = new Path();
        q.add(0);
        q.add(1);
        q.add(2);
        assertTrue(p.equals(q));
        q.add(3);
        assertFalse(p.equals(q));
    }
}