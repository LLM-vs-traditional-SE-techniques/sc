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


public class CodexTest_0_9_63 { 
  @Test
     public void testContainsEdge() {
    	graph.addEdge("ab", "a", "b");
    	graph.addEdge("bc", "b", "c");
    	graph.addEdge("cd", "c", "d");
    	Path path = new Path();
    
    	Edge e1 = graph.getEdge("ab");
    	Edge e2 = graph.getEdge("bc");
    	Edge e3 = graph.getEdge("cd");
    
    	path.addNode(graph.getNode("a"));
    	path.addEdge(e1);
    
    	assertTrue(path.contains(e1));
    	assertFalse(path.contains(e2));
    	assertFalse(path.contains(e3));
    
    	// after adding another node, the first edge should be skipped
    	path.addNode(graph.getNode("b"));
    	assertFalse(path.contains(e1));
    	assertTrue(path.contains(e2));
    	assertFalse(path.contains(e3));
    
    	// after adding another node, the second edge should be skipped
    	path.addNode(graph.getNode("c"));
    	assertFalse(path.contains(e1));
    	assertFalse(path.contains(e2));
    	assertTrue(path.contains(e3));
     }
 
 **/
public class SuggestTests {
}