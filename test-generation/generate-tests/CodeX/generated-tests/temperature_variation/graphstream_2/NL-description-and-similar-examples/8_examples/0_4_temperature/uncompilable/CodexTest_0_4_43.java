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


public class CodexTest_0_4_43 { 
  @Test
    public void testEquals() {
        final Path path1 = new Path();
        final Path path2 = new Path();
        final Path path3 = new Path();
        path1.add(new Node(a));
        path2.add(new Node(b));
        path3.add(new Node(a));
        assertFalse(path1.equals(path2));
        assertTrue(path1.equals(path3));
    }
}