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


public class CodexTest_0_9_8 { 
  @Test
  public void testReferenceEquals() {
    Vector1D v1 = new Vector1D(5.5);
    Vector1D v2 = new Vector1D(5.5);
    Assert.assertTrue("Vectors are not equal", 
    v1.equals(v2));
    Vector1D v3 = new Vector1D(1.1);
    Vector1D v4 = new Vector1D
}