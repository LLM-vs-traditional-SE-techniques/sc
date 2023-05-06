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


public class CodexTest_0_9_28 { 
    @Test
    public void shouldContainTheEdge_WhenAdded() {
        Graph graph = new DefaultGraph(graph);
        Node from = graph.addNode(A);
        Node to = graph.addNode(B);
        Edge edge = graph.connect(from, to);
}