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


public class CodexTest_0_7_6 { 
  @Test
    public void testEquals() {
        Path p1 = new Path(3);
        p1.add(new RealVectorImplTest.RealVectorTestImpl(new double[]{0, 1, 0}));
        p1.add(new RealVectorImplTest.RealVectorTestImpl(new double[]{1, 0, 2}));
        Path p2 = new Path(3);
        p2.add(new RealVectorImplTest.RealVectorTestImpl(new double[]{0, 1, 0}));
        p2.add(new RealVectorImplTest.RealVectorTestImpl(new double[]{1, 0, 2}));
        Assert.assertFalse(p1.equals(p2));
        Assert.assertFalse(p2.equals(p1));
        Assert.assertEquals(p1, p1);
    }
}