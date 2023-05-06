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


public class CodexTest_0_3_3 { 
  @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        assertTrue(path1.equals(path2));
        path1.addNode(new Node(1,1));
        assertFalse(path1.equals(path2));
        path2.addNode(new Node(1,1));
        assertTrue(path1.equals(path2));
        path1.addNode(new Node(2,2));
        assertFalse(path1.equals(path2));
        path2.addNode(new Node(2,2));
        assertTrue(path1.equals(path2));
    }
}