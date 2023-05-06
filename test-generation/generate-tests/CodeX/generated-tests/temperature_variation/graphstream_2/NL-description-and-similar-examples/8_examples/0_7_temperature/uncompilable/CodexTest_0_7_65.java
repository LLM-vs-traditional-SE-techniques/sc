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


public class CodexTest_0_7_65 { 
  @Test
  public void testEqualsMethod() {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Path path = new Path();
        path.setRoot(a);
        path.add(b);
        path.add(c);
        Path path2 = new Path();
        path2.setRoot(a);
        path2.add(b);
        path2.add(c);
        assertTrue(path.equals(path2));
    }
}