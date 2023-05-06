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


public class CodexTest_0_5_2 { 
    @Test
    public void testContains() {
        // given
        Path underTest = new Path(Arrays.asList(new Edge[] {
                new Edge("a", "b", "ab"),
                new Edge("b", "c", "bc"),
                new Edge("c", "d", "cd") }));
        // when
        boolean result = underTest.contains(new Edge("a", "b", "ab"));
        // then
        assertTrue(result);
    }
}