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


public class CodexTest_0_7_8 { 
    @Test
    public void shouldBeEqual() {
        Path path1 = new Path();
        Path path2 = new Path();
        path1.add(null, new DefaultEdge("1"));
        path1.add(new DefaultEdge("1"), new DefaultEdge("2"));
        path2.add(null, new DefaultEdge("1"));
        path2.add(new DefaultEdge("1"), new DefaultEdge("2"));
        assertEquals(path1, path2);
    }

}