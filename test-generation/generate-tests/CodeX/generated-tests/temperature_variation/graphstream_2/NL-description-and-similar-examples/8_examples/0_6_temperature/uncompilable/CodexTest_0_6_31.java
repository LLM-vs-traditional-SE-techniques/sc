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


public class CodexTest_0_6_31 { 
  @Test
      public void testEquals() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(v1);
        Assert.assertTrue(v1.equals(v2));
        Assert.assertTrue(v2.equals(v1));
        v2.setX(0);
        Assert.assertFalse(v1.equals(v2));
        v2.setX(1.0);
        v2.setY(0.0);
        Assert.assertFalse(v1.equals(v2));
        v2.setY(2.0);
        v2.setZ(0.0);
        Assert.assertFalse(v1.equals(v2));
        v2.setZ(3.0);
        Assert.assertTrue(v1.equals(v2));
    }
}