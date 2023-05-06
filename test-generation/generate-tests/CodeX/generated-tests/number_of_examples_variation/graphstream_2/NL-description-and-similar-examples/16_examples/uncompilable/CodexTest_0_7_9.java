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


public class CodexTest_0_7_9 { 
  @Test
    public void testEqualsShouldBeTrueWhenPathsAreEqual() {
        // given
        Path firstPath = new Path();
        Path secondPath = new Path();
        Graph graph = createSimpleGraph();
        firstPath.setRoot(graph.getNode(a));
        firstPath.add(graph.getEdge(ab));
        secondPath.setRoot(graph.getNode(a));
        secondPath.add(graph.getEdge(ab));
        // when
        boolean result = firstPath.equals(secondPath);
        // then
        assertTrue(result);
    }
}