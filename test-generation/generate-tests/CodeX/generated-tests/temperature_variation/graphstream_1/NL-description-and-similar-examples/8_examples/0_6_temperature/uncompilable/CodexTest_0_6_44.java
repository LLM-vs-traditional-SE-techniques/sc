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


public class CodexTest_0_6_44 { 
  @Test
  public void testContainsWithEdge() {
        // given
        Path path = Path.path("a", "b", "c");
        Edge edge = path.getEdgePath().get(1);
        // when
        boolean result = path.contains(edge);
        // then
        assertTrue(result);
    }
}