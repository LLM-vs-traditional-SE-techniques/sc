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


public class CodexTest_0_5_29 { 
  @Test
       public void testEquals() {
        Path path1 = new Path(new double[]{1, 2, 3, 4});
        Path path2 = new Path(new double[]{1, 2, 3, 4});
        Path path3 = new Path(new double[]{1, 2, 3, 4, 5});
        Assert.assertTrue(path1.equals(path2));
        Assert.assertFalse(path1.equals(path3));
        Assert.assertFalse(path2.equals(path3));
    }
}