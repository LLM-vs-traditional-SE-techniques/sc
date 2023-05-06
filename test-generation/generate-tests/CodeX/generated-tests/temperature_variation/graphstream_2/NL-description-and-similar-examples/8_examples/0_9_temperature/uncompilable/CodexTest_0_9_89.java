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


public class CodexTest_0_9_89 { 
     @Test
     public void testEquals() {
         EdgeWeightedDigraph g = new EdgeWeightedDigraph(10);
         g.addEdge(new DirectedEdge(0, 1, 1.0));
         g.addEdge(new DirectedEdge(1, 2, 1.0));
         g.addEdge(new DirectedEdge(2, 3, 1.0));
         int s = 0, t = 3;
         AcyclicLP lp = new AcyclicLP(g, s);
         Path p = lp.pathTo(t);
}