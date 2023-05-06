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


public class CodexTest_0_9_57 { 
   @Test(expected = IllegalArgumentException.class)
        public void containsNode_shouldFailForWrongNode() {
            // given
            Graph graph = createSimpleGraph();
            Path path = createPath(graph);
            // then
            // this has to fail as node x is not in the graph
            assertTrue(path.containsNode(graph.getNode(x)));
}