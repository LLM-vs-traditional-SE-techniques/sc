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


public class CodexTest_0_7_1 { 
    @Test
    public void should_add_edge_to_path() {
        // given
        Edge ab = graph.addEdge("ab", "a", "b");
        Edge bc = graph.addEdge("bc", "b", "c");
        Edge cd = graph.addEdge("cd", "c", "d");
        Path path = new Path();
}