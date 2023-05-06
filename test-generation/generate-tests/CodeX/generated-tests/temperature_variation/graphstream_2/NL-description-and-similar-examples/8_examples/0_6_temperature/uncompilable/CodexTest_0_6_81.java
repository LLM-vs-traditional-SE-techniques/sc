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


public class CodexTest_0_6_81 { 
  @Test
  public void testEquals() {
        Assert.assertTrue(v.equals(v));
        Assert.assertFalse(v.equals(null));
        Assert.assertFalse(v.equals(Double.valueOf(0)));
        Assert.assertFalse(v.equals(new Vector1D(2)));
        Assert.assertTrue(v.equals(new Vector1D(1)));
    }
}