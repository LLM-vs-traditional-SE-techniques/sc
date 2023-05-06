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


public class CodexTest_0_8_36 { 
    @Test
    public void testContainsSucceed(){
        edgelist.add(e1);
        Graph<String, Edge> graph = new DefaultGraph<String, Edge>("Graph", true, true);
        Path<String, Edge> path = new Path<String, Edge>(graph);
        path.setRoot(v1);
        path.add(e1);
        assertTrue(path.contains(e1));
    }
}