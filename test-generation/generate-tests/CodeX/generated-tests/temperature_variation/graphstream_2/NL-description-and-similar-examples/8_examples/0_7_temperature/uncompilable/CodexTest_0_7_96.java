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


public class CodexTest_0_7_96 { 
    @Test
    public void testEquals() {
        Graph graph = createSimpleGraph();
        Path path1 = new Path();
        Path path2 = new Path();
        path1.setRoot(graph.getNode(a));
        path2.setRoot(graph.getNode(a));
        assertFalse(path1.equals(path2));
    }
}