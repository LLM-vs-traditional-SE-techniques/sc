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


public class CodexTest_0_9_4 { 
    @Test
    public void equalityTest1() {
        Graph graph = new DefaultGraph("test");
        Graph graph1 = new DefaultGraph("test");
        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph1.setStrict(false);
        graph1.setAutoCreate(true);
        graph.addEdge("A-A", "A", "A");
        graph1.addEdge("A-A", "A", "A");
}