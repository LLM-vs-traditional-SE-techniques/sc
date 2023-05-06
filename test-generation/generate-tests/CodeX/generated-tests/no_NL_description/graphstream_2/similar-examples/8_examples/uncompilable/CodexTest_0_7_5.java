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


public class CodexTest_0_7_5 { 
    @Test
    public void testEqualsPath() {
        // given
        Path path = createPath(graph, "ab", "bc", "cd", "da");
        Path path1 = createPath(graph, "ab", "bc", "cd", "da");
        Path path2 = createPath(graph, "ab", "bc", "cd");
        // when
        boolean result = path.equals(path1);
        boolean result2 = path.equals(path2);
        // then
        assertTrue(result);
        assertFalse(result2);
    }
}