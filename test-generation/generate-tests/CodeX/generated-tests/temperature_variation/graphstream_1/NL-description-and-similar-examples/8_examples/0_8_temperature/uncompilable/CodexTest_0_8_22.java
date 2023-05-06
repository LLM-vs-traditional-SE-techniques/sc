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


public class CodexTest_0_8_22 { 
    @Test
    public void contains_whenEdgeIsInThePath_ReturnTrue() {
        Graph graph = new DefaultGraph("graph");
        graph.setStrict(true);
        graph.addEdge("ab", "a", "b");
        graph.addEdge("bc", "b", "c");
        graph.addEdge("ca", "c", "a");
        graph.addEdge("ad", "a", "d");
        graph.addEdge("bd", "b", "d");
        graph.addEdge("dc", "d", "c");
}