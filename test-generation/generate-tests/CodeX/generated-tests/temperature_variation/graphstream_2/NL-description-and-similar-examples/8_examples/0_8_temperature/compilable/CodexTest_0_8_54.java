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


public class CodexTest_0_8_54 { 
  @Test
    public void equals_DifferentNodes() {
        Graph g = new DefaultGraph("g");
        g.addNode("a");
        g.addNode("b");
        g.addNode("c");
        Path p1 = new Path();
        p1.setRoot(g.getNode("a"));
        Path p2 = new Path();
        p2.setRoot(g.getNode("b"));
        assertFalse(p1.equals(p2));
    }

}