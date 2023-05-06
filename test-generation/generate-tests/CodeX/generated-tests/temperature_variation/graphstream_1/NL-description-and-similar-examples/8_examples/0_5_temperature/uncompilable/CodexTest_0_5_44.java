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


public class CodexTest_0_5_44 { 
    @Test
    public void testContains() {
        Path path = new Path();
        Edge edge1 = new Edge("edge1", "node1", "node2");
        Edge edge2 = new Edge("edge2", "node2", "node3");
        Edge edge3 = new Edge("edge3", "node3", "node4");
}