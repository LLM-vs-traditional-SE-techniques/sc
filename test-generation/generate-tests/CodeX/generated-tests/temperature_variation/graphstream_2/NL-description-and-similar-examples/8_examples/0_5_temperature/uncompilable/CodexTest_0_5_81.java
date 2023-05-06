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


public class CodexTest_0_5_81 { 
    @Test
    public void testEquals() {
        Path path = new Path();
        Path path2 = new Path();
        Assert.assertTrue(path.equals(path2));
        path.add(new Node());
        Assert.assertFalse(path.equals(path2));
        path2.add(new Node());
        Assert.assertTrue(path.equals(path2));
    }
}