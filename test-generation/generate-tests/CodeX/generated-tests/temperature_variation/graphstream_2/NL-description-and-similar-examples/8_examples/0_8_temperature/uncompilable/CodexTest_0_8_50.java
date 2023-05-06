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


public class CodexTest_0_8_50 { 
  @Test
    public void testAdd_edgeShouldNotBeAdded() {
        // given
        Graph graph = createSimpleGraph();
        Path path = new Path();
        path.setRoot(graph.getNode(a));
        Path result = new Path();
        result.setRoot(graph.getNode(a));
        result.add(graph.getEdge(ab));
        // when
        path.add(graph.getEdge(bc));
        // then
        assertNotEquals(result, path);
    }
**/
}