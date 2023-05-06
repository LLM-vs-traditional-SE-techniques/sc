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


public class CodexTest_0_5_44 { 
    @Test
    public void equals_shouldReturnTrueWhenNodesAreEqual() {
        // given
        Graph graph = createSimpleGraph();
        Path path = new Path();
        Path path2 = new Path();
        // when
        path.setRoot(graph.getNode(a));
        path2.setRoot(graph.getNode(a));
        // then
        assertTrue(path.equals(path2));
    }
}