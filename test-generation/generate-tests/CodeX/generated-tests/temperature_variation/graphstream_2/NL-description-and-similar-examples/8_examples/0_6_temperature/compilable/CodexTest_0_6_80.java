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


public class CodexTest_0_6_80 { 
  @Test
    public void testEquals() {
        Path path = new Path();
        Assert.assertTrue(path.equals(path));
        Assert.assertFalse(path.equals(null));
        Assert.assertFalse(path.equals(1));
        Assert.assertFalse(path.equals(new Path()));
    }
}