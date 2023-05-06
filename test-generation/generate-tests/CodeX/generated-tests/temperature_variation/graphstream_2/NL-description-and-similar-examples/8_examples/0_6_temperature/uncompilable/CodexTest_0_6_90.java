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


public class CodexTest_0_6_90 { 
  @Test
   public void testEquals_whenPathsAreSame_shouldReturnTrue() {
        // given
        Graph graph = createSimpleGraph();
        Path path = graph.traverse(Arrays.asList(graph.getNode(a), graph.getNode(b), graph.getNode(c)));
        Path path2 = graph.traverse(Arrays.asList(graph.getNode(a), graph.getNode(b), graph.getNode(c)));
        // when
        boolean result = path.equals(path2);
        // then
        assertTrue(result);
    }
}