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


public class CodexTest_0_9_7 { 
    @Test
    public void equalsNoPaths2() throws Exception {
        // no nodes in paths
        Graph graph = new DefaultGraph("g1");
        Path path1 = new Path();
        Path path2 = new Path();
        assertEquals(path1, path2);
    }
    @Test
    public void equalsDifferentPath() {
        Graph graph = new DefaultGraph();
        graph.setAutoCreate(true);
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        Path path1 = new Path(graph, "A", "B", "C", "D");
        Path path2 = new Path(graph, "a", "A", "B", "C", "D");
        assertFalse(path1.equals(path2));
    }
}