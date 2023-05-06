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


public class CodexTest_0_9_23 { 
    @Test
    public void equals_shouldReturnTrueForSamePaths() {
        // given
        Graph graph = createSimpleGraph();
        Path path1 = new Path();
        Path path2 = new Path();
        // when
        path1.setRoot(graph.getNode(a));
        path2.setRoot(graph.getNode(a));
        path1.add(graph.getEdge(ab));
        path2.add(graph.getEdge(ab));
        // then
        assertThat(path1, equalTo(path2));
    }
}