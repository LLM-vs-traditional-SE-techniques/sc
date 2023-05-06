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


public class CodexTest_0_8_48 { 
    @Test
    @SuppressWarnings("deprecation")
    public void testContainsEdge() {
        Graph<String, String> g = new SimpleGraph<>( SupplierUtil.createStringSupplier(), SupplierUtil.createStringSupplier(), false);
        g.addVertex("v1");
        g.addVertex("v2");
        g.addVertex("v3");
        g.addEdge("e1", "v1", "v2");
        g.addEdge("e2", "v2", "v3");
        g.addEdge("e3", "v1", "v3");
        Path<String, String> path = new ArrayListPath<>(g, Arrays.asList("v1", "v2", "v3"),
                Arrays.asList("e1", "e2"));
}