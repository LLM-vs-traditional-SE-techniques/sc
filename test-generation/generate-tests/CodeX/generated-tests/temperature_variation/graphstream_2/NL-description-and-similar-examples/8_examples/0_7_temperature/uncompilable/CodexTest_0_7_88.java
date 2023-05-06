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


public class CodexTest_0_7_88 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        Path p3 = new Path();
        p3.add(0,0);
        Path p4 = new Path();
        p4.add(0,0);
        p4.add(1,1);
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        assertFalse(p1.equals(p5));
        assertFalse(p5.equals(p1));
        assertFalse(p1.equals(p3));
        assertFalse(p3.equals(p1));
        assertFalse(p1.equals(p4));
        assertFalse(p4.equals(p1));
        assertTrue(p3.equals(p4));
        assertTrue(p4.equals(p3));
        assertTrue(p2.equals(p2));
        assertTrue(p3.equals(p3));
        assertFalse(p1.equals(null));
    }
}