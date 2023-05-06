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


public class CodexTest_0_9_23 { 
    @Test
    public void testContainsEdge() {
        DefaultGraph<String, String> graph = new DefaultGraph<>(AbstractBaseGraphTest.UNDIRECTED);
        graph.addVertex("0");
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addEdge("0-1");
        graph.addEdge("1-2");
        graph.addEdge("0-1");
        Path<String, String> sut = new Path<>();
}