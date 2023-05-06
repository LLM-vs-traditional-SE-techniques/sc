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


public class CodexTest_0_6_64 { 
  @Test
    public void testEqualsWithNull() {
        Path path = new Path();
        path.add(new Node("a"));
        path.add(new Node("b"));
        path.add(new Node("c"));
        path.add(new Node("d"));
        path.add(new Node("e"));
        assertFalse("Path is equal to null", path.equals(null));
    }
}