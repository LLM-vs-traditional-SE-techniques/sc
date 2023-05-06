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


public class CodexTest_0_8_12 { 
  @Test
    public void testEqualsWhenValid() {
        Graph graph = new DefaultGraph(test);
        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.addEdge(ab, a, b);
        graph.addEdge(ad, a, d);
        graph.addEdge(de, d, e);
        
        graph.addEdge(bc, b, c);
        graph.addEdge(bg, b, g);
        graph.addEdge(cg, c, g);
        graph.addEdge(cg, g, c);
        
        Path path = new Path();
        path.setRoot(graph.getNode(a));
        path.add(graph.getEdge(ad));
        path.add(graph.getEdge(de));
        
        Path path2 = new Path();
        path2.setRoot(graph.getNode(a));
        path2.add(graph.getEdge(ad));
        path2.add(graph.getEdge(de));
}