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


public class CodexTest_0_6_3 { 
  @Test
    public void equals_twoPathsWithSameNodesAreEqual() {
        // given
        Graph graph = createSimpleGraph();
        Path p1 = new Path();
        Path p2 = new Path();
        // when
        p1.setRoot(graph.getNode(a));
        p1.add(graph.getEdge(ab));
        p1.add(graph.getEdge(bc));
        p2.setRoot(graph.getNode(a));
        p2.add(graph.getEdge(ab));
        p2.add(graph.getEdge(bc));
        // then
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }
}