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


public class CodexTest_0_9_96 { 
    @Test
    void equals_shouldReturnFalseWhenTwoPathsWithSameNodeSequenceAreCompared() {
        // given
        Graph graph = GraphTest.createSimpleGraph();
        Path path1 = getPathInGraph(graph);
        Path path2 = getPathInGraph(graph);
        // then
        assertEquals(path2, path1);
    }
}