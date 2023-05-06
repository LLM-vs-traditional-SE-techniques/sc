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


public class CodexTest_0_9_27 { 
  @Test
    public void testEquality() {
        Vector1D v1 = createVector1D(2);
        Vector1D v2 = createVector1D(2);
        Vector1D v3 = createVector1D(3);
        Vector1D v4 = createVector1D(Integer.MAX_VALUE - 1);
        Vector1D v5 = createVector1D(Integer.MAX_VALUE - 1);
        Assert.assertEquals(v1, v2);
        Assert.assertTrue(!v1.equals(v3));
        Assert.assertTrue(!v1.equals(v4));
        Assert.assertEquals(v4, v5);
        Assert.assertTrue(!v5.equals(v3));
    }
}