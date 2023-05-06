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


public class CodexTest_0_8_8 { 
      @Test
      public void testEquals() {
        Path p1 = new Path(new Node[] {n1, n2});
        Path p2 = new Path(new Node[] {n1, n2});
        Path p3 = new Path(new Node[] {n2, n1});
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
      }
}