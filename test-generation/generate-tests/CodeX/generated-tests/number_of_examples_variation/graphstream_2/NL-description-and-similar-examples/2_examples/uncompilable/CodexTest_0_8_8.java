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


public class CodexTest_0_8_8 { 
    @Test
    public void equals_twoPathsWithSameEdges() {
        Graph graph = new DefaultGraph("test");
        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.addEdge("ab", "a", "b");
        graph.addEdge("bc", "b", "c");
        graph.addEdge("cd", "c", "d");
        graph.addEdge("dc", "d", "c");
        Path path1 = new Path();
        Path path2 = new Path();
        path1.add(graph.getEdge("ab"));
        path1.add(graph.getEdge("bc"));
        path1.add(graph.getEdge("cd"));
        path2.add(graph.getEdge("ab"));
        path2.add(graph.getEdge("bc"));
        path2.add(graph.getEdge("cd"));
}