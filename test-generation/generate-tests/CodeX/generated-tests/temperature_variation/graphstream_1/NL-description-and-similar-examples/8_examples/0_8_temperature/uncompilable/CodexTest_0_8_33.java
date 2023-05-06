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


public class CodexTest_0_8_33 { 
        @Test
        public void testPathContainsEdge() {
            // given
            Graph graph = new DefaultGraph("test");
            graph.setStrict(false);
            graph.setAutoCreate(true);
            graph.addEdge("ab", "a", "b");
            Path path = new Path();
            path.add(graph.getVertex("a"));
            path.add(graph.getVertex("b"));
            // when
            boolean contains = path.contains(graph.getEdge("ab"));
            // then
            assertTrue(contains);
        }
}