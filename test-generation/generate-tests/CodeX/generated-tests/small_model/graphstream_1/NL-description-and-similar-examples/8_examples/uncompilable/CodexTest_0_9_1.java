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


public class CodexTest_0_9_1 { 
  @Test
    public void testContains() {
        final Edge e1 = new EdgeImpl(0);
        final Edge e2 = new EdgeImpl(1);
        final Edge e3 = new EdgeImpl(2);
        Path<Edge> path = new Path<Edge>();
        assertEquals(path, path.getPath(e2));
        path.push(e1);
        path.push(e2);
        assertEquals(path, path.getPath(e2));
        path.push(e3);
        assertEquals(path, path.getPath(e2));
        assertEquals(path, path.getPath(e3));
    }
}