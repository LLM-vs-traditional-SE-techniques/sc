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


public class CodexTest_0_9_28 { 
  @Test
    public void shouldEqualSeparateInstancesCreatedFromSameNodes() {
        Graph graph = createGraph();
        PathFactory pathFactory = graph.traversal().paths();
        Path original = pathFactory.make().extend(graph.traversal().V(1), graph.traversal().V(2), graph.traversal().V(3), graph.traversal().V(4));
        Path other = pathFactory.make().extend(graph.traversal().V(1), graph.traversal().V(2), graph.traversal().V(3), graph.traversal().V(4));
        assertEquals(original, other);
    }
}