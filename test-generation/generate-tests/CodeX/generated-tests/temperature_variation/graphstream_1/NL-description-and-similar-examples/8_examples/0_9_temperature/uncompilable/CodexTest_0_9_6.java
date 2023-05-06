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


public class CodexTest_0_9_6 { 
        @Test
    	public void contains() {
    		Graph graph = new SingleGraph("test");
    		graph.addEdge("ab", "a", "b");
    		graph.addEdge("bc", "b", "c");
    		graph.addEdge("cd", "c", "d");
    		Path path = new Path();
    		path.add(graph.getEdge("ab"));
    		path.add(graph.getEdge("bc"));
    		path.add(graph.getEdge("cd"));
}