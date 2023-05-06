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


public class CodexTest_0_9_29 { 
  @Test
  public void ifNull(boolean nullExpected) {
    if (x < 0 || x > 2) {
      if (nullExpected) {
        assertNull("Expected null", result.getEntry(x));
      } else {
        assertNotNull("Expected not null", result.getEntry(x));
      }
    }
  }
}