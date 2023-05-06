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


public class CodexTest_0_8_76 { 
    @Test
    public void testEqualsAndHashCode() {
        Edge edge = new DefaultEdge("A", "B", "C");
        Path path1 = new Path(edge);
        Path path2 = new Path(edge);
        assertEquals(path1, path2);
        assertEquals(path1.hashCode(), path2.hashCode());
    }
}