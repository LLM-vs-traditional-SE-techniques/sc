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


public class CodexTest_0_8_16 { 
        @Test
        public void testEquality() {
            Graph graph = createSimpleGraph();
            Path path1 = createSimplePath(graph);
            Path path2 = createSimplePath(graph);
            assertTrue(path1.equals(path2));
            assertTrue(path2.equals(path1));
}