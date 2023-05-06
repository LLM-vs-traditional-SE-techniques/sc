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


public class CodexTest_0_5_3 { 
  @Test
    public void testEquals() {
        Vector3D v1 = new Vector3D(-1, 0, 0);
        Vector3D v2 = new Vector3D(-1, 0, 0);
        Assert.assertTrue(v1.equals(v2));
    }
}