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


public class CodexTest_0_9_5 { 
    @Test
    public boolean equalsTest1() {
        Path path1 = new Path();
        Path path2 = new Path();
        path1.add(null, graph.getEdge("ab"));
        path1.add(graph.getNode("b"), graph.getEdge("bc"));
        path2.add(null, graph.getEdge("ab"));
        path2.add(graph.getNode("b"), graph.getEdge("bc"));
        boolean expResult = true;
        boolean result = path1.equals(path2);
        assertEquals(expResult, result);
    }
```
}