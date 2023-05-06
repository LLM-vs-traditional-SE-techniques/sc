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


public class CodexTest_0_9_12 { 
  @Test
    public void testAdditionLaplaceZero() {
        final double[] a = { -0.5, 1.5, 0.3, -0.1 };
        final double[] expected = { -1.5, 0.5, 0.3, -1.1 };
        final LaplaceDistribution l = new LaplaceDistribution(0, 1);
        final double[] actual = new double[a.length];
        l.addition(a, actual);
        Assert.assertArrayEquals(expected, actual, Double.MIN_VALUE);
    }
}