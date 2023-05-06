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


public class CodexTest_0_5_63 { 
  @Test
  public void testEquals() {
        Path a = new Path();
        a.add(new Node("a"));
        a.add(new Node("b"));
        a.add(new Node("c"));
        a.add(new Node("d"));
        a.add(new Node("e"));
        Path b = new Path();
        b.add(new Node("a"));
        b.add(new Node("b"));
        b.add(new Node("c"));
        b.add(new Node("d"));
        b.add(new Node("e"));
        assertTrue(a.equals(b));
    }
}