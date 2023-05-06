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


public class CodexTest_0_8_79 { 
  @Test
      public void testEquals() {
          for (int k = 1; k < 10; ++k) {
              Vector u = new Vector(k);
              Vector v = new Vector(k);
              Assert.assertTrue(u.equals(u));
              Assert.assertEquals(0.0, u.dotProduct(v), 1.0e-15);
          }
      }
}