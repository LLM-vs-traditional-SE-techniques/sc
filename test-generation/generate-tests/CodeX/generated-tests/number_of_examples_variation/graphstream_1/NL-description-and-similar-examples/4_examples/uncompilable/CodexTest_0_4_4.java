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


public class CodexTest_0_4_4 { 
    @Test
    public void contains_whenEdgeNotContainedInPath_shouldReturnFalse() {
        // given
        Path path = new Path();
        Edge edge = new DefaultEdge("a", "b", "c");
        // when
        boolean result = path.contains(edge);
        // then
        assertFalse(result);
    }
}