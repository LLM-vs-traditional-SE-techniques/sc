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


public class CodexTest_0_7_7 { 
  @Test
    public void testEqualsDifferentLength(){
        Path p1 = new Path();
        p1.add(new Edge("a", "b"));
        Path p2 = new Path();
        p2.add(new Edge("a", "b"));
        p2.add(new Edge("b", "c"));
        assertFalse(p1.equals(p2));
    }
}