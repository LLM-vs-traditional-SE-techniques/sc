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


public class CodexTest_0_5_51 { 
  @Test
    public void testEquals() {
        Path path = new Path();
        path.setRoot(new Node("A"));
        path.add(new Edge("A-B"));
        path.add(new Edge("B-C"));
        path.add(new Edge("C-D"));
        path.add(new Edge("D-E"));
        path.add(new Edge("E-F"));
        path.add(new Edge("F-G"));
        Path path2 = new Path();
        path2.setRoot(new Node("A"));
        path2.add(new Edge("A-B"));
        path2.add(new Edge("B-C"));
        path2.add(new Edge("C-D"));
        path2.add(new Edge("D-E"));
        path2.add(new Edge("E-F"));
        path2.add(new Edge("F-G"));
        Assert.assertTrue("Paths are equal", path.equals(path2));
    }
}