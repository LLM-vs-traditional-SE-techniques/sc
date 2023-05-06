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


public class CodexTest_0_5_31 { 
    @Test
    public void contains_whenContainsEdge_thenReturnsTrue() {
        // given
        Graph graph = new TinkerGraph();
        graph.addVertex(T.id, "1", T.label, "person");
        graph.addVertex(T.id, "2", T.label, "person");
        graph.addVertex(T.id, "3", T.label, "person");
        graph.addVertex(T.id, "4", T.label, "person");
        graph.addVertex(T.id, "5", T.label, "person");
        graph.addEdge(null, "1", "2", "knows");
        graph.addEdge(null, "2", "3", "knows");
        graph.addEdge(null, "3", "4", "knows");
        graph.addEdge(null, "4", "5", "knows");
        Edge edge = graph.getEdge("4");
        Path path = new Path();
        path.add(graph.getEdge("1"));
        path.add(graph.getEdge("2"));
        path.add(graph.getEdge("3"));
        path.add(graph.getEdge("4"));
}