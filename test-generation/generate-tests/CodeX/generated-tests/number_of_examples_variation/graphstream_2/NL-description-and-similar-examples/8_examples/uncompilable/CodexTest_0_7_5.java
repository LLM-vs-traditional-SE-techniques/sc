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
    public void equals_whenPathsAreNotEqual() {
        // given
        Graph g = createSimpleGraph();
        Path path1 = new Path();
        path1.setRoot(g.getNode(a));
        path1.add(g.getEdge(ab));
        Path path2 = new Path();
        path2.setRoot(g.getNode(a));
        path2.add(g.getEdge(ad));
        // when
        boolean result = path1.equals(path2);
        // then
        assertFalse(result);
    }
}