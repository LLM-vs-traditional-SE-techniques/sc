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


public class CodexTest_0_0_1 { 
  @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        assertEquals(path1, path2);
        path1.add(new Node(a));
        assertNotEquals(path1, path2);
        path2.add(new Node(a));
        assertEquals(path1, path2);
        path1.add(new Node(b));
        assertNotEquals(path1, path2);
        path2.add(new Node(b));
        assertEquals(path1, path2);
    }
}