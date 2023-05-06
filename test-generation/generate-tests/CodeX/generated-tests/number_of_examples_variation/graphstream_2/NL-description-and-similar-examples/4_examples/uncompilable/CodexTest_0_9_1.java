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


public class CodexTest_0_9_1 { 
    @Test
    public void testEqualIsFalseWhenNodePathHasDifferentNumberOfNodes() {
        Path p = new Path();
        Graph g = new DefaultGraph("g");
        Graph g1 = new DefaultGraph("g1");
        g.addNode(1).addNode(2).addNode(3).addNode(4);
        g1.addNode(1).addNode(2);
}