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


public class CodexTest_0_8_84 { 
  @Test
  public void testEquals() {
    Vector1D v1 = new Vector1D(1);
    Vector1D v2 = new Vector1D(1);
    Vector1D v3 = new Vector1D(2);
    Assert.assertTrue(v1.equals(v1));
    Assert.assertTrue(v1.equals(v2));
    Assert.assertFalse(v1.equals(v3));
    Assert.assertFalse(v1.equals(null));
    Assert.assertFalse(v1.equals(1.0));
  }
}