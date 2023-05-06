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


public class CodexTest_0_6_88 { 
    @Test
    public void testEquals() {
        Path p = new Path();
        Graph graph = new DefaultGraph("g");
        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.addEdge("AB","A", "B");
        graph.addEdge("BC","B", "C");
        graph.addEdge("CA","C", "A");
        p.setRoot(graph.getNode("A"));
        p.add(graph.getEdge("AB"));
        p.add(graph.getEdge("BC"));
        p.add(graph.getEdge("CA"));
        Path p2 = new Path();
        p2.setRoot(graph.getNode("A"));
        p2.add(graph.getEdge("AB"));
        p2.add(graph.getEdge("BC"));
        p2.add(graph.getEdge("CA"));
        Assert.assertTrue(p.equals(p2));
    }
}