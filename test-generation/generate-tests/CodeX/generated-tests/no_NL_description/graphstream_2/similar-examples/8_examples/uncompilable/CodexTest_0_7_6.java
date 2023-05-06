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


public class CodexTest_0_7_6 { 
  @Test
    public void testEquals() {
        final int n = 10;
        final Path p1 = new Path();
        final Path p2 = new Path();
        for (int i = 0; i < n; i++) {
            assertEquals(p1, p2);
            p1.add(new Edge(new Node(String.valueOf(i)), new Node(String.valueOf(i + 1))));
            p2.add(new Edge(new Node(String.valueOf(i)), new Node(String.valueOf(i + 1))));
        }
        assertEquals(p1, p2);
    }
}