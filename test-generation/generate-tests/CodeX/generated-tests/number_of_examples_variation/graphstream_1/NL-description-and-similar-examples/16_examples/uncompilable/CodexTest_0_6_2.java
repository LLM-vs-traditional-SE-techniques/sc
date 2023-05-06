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


public class CodexTest_0_6_2 { 
    @Test
    public void edgePathContainsEdge() {
        Edge e = new Edge(new Vertex("A"), new Vertex("B"), 1);
        EdgePath ep = new EdgePath();
        ep.addEdge(e);
        assertTrue(ep.contains(e));
    }
}