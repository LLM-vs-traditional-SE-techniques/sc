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


public class CodexTest_0_5_9 { 
  @Test
    public void testEquals() {
        Path p = new Path();
        assertTrue(p.equals(p));
        assertTrue(p.equals(new Path()));
        assertFalse(p.equals(new Object()));
        assertFalse(p.equals(null));
        p.add(new Node("A"));
        assertFalse(p.equals(new Path()));
        p.add(new Node("
}