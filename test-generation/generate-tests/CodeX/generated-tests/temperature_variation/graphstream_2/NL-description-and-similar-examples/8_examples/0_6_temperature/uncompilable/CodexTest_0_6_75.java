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


public class CodexTest_0_6_75 { 
  @Test
    public void testEquals() {
        Path path = createSimplePath();
        Path anotherPath = createSimplePath();
        assertEquals(true, path.equals(anotherPath));
        path.add(graph.getEdge(bc));
        assertEquals(false, path.equals(anotherPath));
    }
}