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


public class CodexTest_0_6_66 { 
  @Test
  public void testEquals() {
      final Node a = new Node();
      final Node b = new Node();
      final Node c = new Node();
      Path p1 = new Path();
      p1.setRoot(a);
      p1.add(b);
      p1.add(c);
      Path p2 = new Path();
      p2.setRoot(a);
      p2.add(b);
      p2.add(c); 
      assertEquals(p1,p2);
  }
}