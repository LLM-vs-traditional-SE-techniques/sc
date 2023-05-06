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


public class CodexTest_0_8_96 { 
    @Test
    public void testEqualsExpectFalse() {
        // given
        Path path1 = createSimplePath();
        Path path2 = createSimplePath();
        path1.remove(graph.getEdge(ab));
        // when
        boolean result = path1.equals(path2);
        // then
        assertFalse(result);
    }
}