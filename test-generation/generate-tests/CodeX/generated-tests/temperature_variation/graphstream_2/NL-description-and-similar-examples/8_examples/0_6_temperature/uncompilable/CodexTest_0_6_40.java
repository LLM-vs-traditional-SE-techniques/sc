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


public class CodexTest_0_6_40 { 
    @Test
    public void equals_pathsShouldBeEqualWhenSameNodesAndEdges() {
        // given
        Graph graph = createSimpleGraph();
        Path p1 = new Path();
        p1.setRoot(graph.getNode(a));
        p1.add(graph.getEdge(ab));
        p1.add(graph.getEdge(bc));
        p1.add(graph.getEdge(cd));
        Path p2 = new Path();
        p2.setRoot(graph.getNode(a));
        p2.add(graph.getEdge(ab));
        p2.add(graph.getEdge(bc));
        p2.add(graph.getEdge(cd));
        // when
        boolean result = p1.equals(p2);
        // then
        assertTrue(result);
    }
}