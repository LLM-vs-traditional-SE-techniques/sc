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


public class CodexTest_0_7_10 { 
  @Test
  public void testEquals() {
    Path p = new Path();
    Edge e1 = new Edge("e1", "x", "y");
    Edge e2 = new Edge("e2", "x", "y");
    p.add(e1);
    p.add(e2);
    Path p1 = new Path();
    p1.add(e1);
    p1.add(e2);
}