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


public class CodexTest_0_9_75 { 
  @Test
      public static void testEquals() {
        SimplePath path1 = new SimplePath();
        SimplePath path2 = new SimplePath();
        Assert.assertTrue(path1.equals(path2));
        path1.add(node1);
        Assert.assertFalse(path1.equals(path2));
        path2.add(node1);
        Assert.assertTrue(path1.equals(path2));
        path1.add(node1);
        Assert.assertFalse(path1.equals(path2));
        path2.add(node1);
        Assert.assertTrue(path1.equals(path2));
      }
}