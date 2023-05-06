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


public class CodexTest_0_9_24 { 
    @Test
    public void testSameEdgePathDirectionIndependent() {
        Graph graph = createSimpleGraph();
        Path path = new Path();
        path.setRoot(graph.getNode(a));
        path.add(graph.getEdge(ab));
        path.add(graph.getEdge(bc));
        path.add(graph.getEdge(cd));
        Path pathB = new Path();
        pathB.setRoot(graph.getNode(a));
        pathB.add(graph.getEdge(cd));
        pathB.add(graph.getEdge(bc));
        pathB.add(graph.getEdge(ab));
        Assert.assertTrue(path.equals(pathB));
        Assert.assertTrue(pathB.equals(path));
    }
}
}