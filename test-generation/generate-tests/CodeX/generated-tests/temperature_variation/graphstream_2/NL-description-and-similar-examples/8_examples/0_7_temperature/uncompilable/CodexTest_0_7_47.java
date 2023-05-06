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


public class CodexTest_0_7_47 { 
  @Test
  public void testEquals() {
    AlgVector v1 = new AlgVector(new double[] {-2, 3, 4});
    AlgVector v2 = new AlgVector(new double[] {-2, 3, 4});
    AlgVector v3 = new AlgVector(new double[] {-2, 3, 4, 5});
    assertTrue(v1.equals(v2));
    assertTrue(v2.equals(v3) == false);
  }
}