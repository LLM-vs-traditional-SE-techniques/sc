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


public class CodexTest_0_3_10 { 
  @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        Node node1 = new DefaultNode("node1");
        Node node2 = new DefaultNode("node2");
        Node node3 = new DefaultNode("node3");
        path1.add(node1);
        path1.add(node2);
        path1.add(node3);
        path2.add(node1);
        path2.add(node2);
        path2.add(node3);
        assertTrue(path1.equals(path2));
        path2.add(node1);
        assertFalse(path1.equals(path2));
    }
}