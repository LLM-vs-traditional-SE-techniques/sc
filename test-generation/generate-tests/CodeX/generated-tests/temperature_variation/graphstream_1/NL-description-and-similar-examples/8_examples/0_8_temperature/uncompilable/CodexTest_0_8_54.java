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
    public void testContain(){
    	Graph graph = new DefaultGraph("Graph");
    	graph.addEdge(new DefaultEdge());
    	DefaultPath p = new DefaultPath(graph.getEdgeSet());
    	assertTrue(p.contains(graph.getEdge("1-2")));
    }
}