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


public class CodexTest_0_3_19 { 
  @Test
    public void testEquals() {
        Path path1 = new Path();
        path1.add(new Node(1));
        path1.add(new Node(2));
        path1.add(new Node(3));
        Path path2 = new Path();
        path2.add(new Node(1));
        path2.add(new Node(2));
        path2.add(new Node(3));
        assertTrue(path1.equals(path2));
    }
}