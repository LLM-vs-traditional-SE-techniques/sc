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


public class CodexTest_0_6_69 { 
        @Test
        public void testContains() {
            Path path = new Path();
            path.add(null, new DefaultEdge("a", "b", "c"));
            path.add(null, new DefaultEdge("b", "c", "d"));
            path.add(null, new DefaultEdge("c", "d", "e"));
}