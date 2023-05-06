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


public class CodexTest_0_6_91 { 
    @Test
    public void testEquals() {
        Path path = new Path();
        Path path2 = new Path();
        path.add(null, new Edge(new Node("node"), new Node("node2")));
        path2.add(null, new Edge(new Node("node"), new Node("node2")));
        path.add(new Node("node2"), new Edge(new Node("node2"), new Node("node3")));
        path2.add(new Node("node2"), new Edge(new Node("node2"), new Node("node3")));
}