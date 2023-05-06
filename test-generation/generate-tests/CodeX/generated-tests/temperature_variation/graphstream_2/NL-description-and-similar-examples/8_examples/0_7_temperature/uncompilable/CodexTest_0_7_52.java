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


public class CodexTest_0_7_52 { 
    @Test
    public void testEquals() {
        Path path = new Path();
        path.setRoot(graph.getNode("a"));
        path.add(graph.getEdge("ab"));
        path.add(graph.getEdge("bc"));
        path.add(graph.getEdge("cd"));
        path.add(graph.getEdge("da"));
        path.add(graph.getEdge("ad"));
        path.add(graph.getEdge("db"));
        path.add(graph.getEdge("bd"));
        path.add(graph.getEdge("dc"));
        path.add(graph.getEdge("ca"));
        // the following path should be equal to the previous one
        Path path2 = new Path();
        path2.setRoot(graph.getNode("a"));
        path2.add(graph.getEdge("ab"));
        path2.add(graph.getEdge("bc"));
        path2.add(graph.getEdge("cd"));
        path2.add(graph.getEdge("da"));
        path2.add(graph.getEdge("ad"));
        path2.add(graph.getEdge("db"));
        path2.add(graph.getEdge("bd"));
        path2.add(graph.getEdge("dc"));
        path2.add(graph.getEdge("ca"));
        assertEquals("The two paths should be equal", path, path2);
    }
}