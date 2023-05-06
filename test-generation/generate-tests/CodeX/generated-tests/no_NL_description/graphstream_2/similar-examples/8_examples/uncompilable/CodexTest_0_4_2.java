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


public class CodexTest_0_4_2 { 
    @Test
    public void testEquals() {
        Path path = new Path();
        path.setRoot(graph.getNode(a));
        path.add(graph.getEdge(ab));
        path.add(graph.getEdge(bc));
        path.add(graph.getEdge(cd));
        path.add(graph.getEdge(de));
        path.add(graph.getEdge(ef));
        path.add(graph.getEdge(fg));
        path.add(graph.getEdge(ga));
        Path path2 = new Path();
        path2.setRoot(graph.getNode(a));
        path2.add(graph.getEdge(ab));
        path2.add(graph.getEdge(bc));
        path2.add(graph.getEdge(cd));
        path2.add(graph.getEdge(de));
        path2.add(graph.getEdge(ef));
        path2.add(graph.getEdge(fg));
        path2.add(graph.getEdge(ga));
        assertTrue(path.equals(path2));
    }
}