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


public class CodexTest_0_4_16 { 
    @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        path1.setRoot(new DefaultNode("a"));
        path2.setRoot(new DefaultNode("a"));
        Assert.assertEquals(path1, path2);
        path1.add(new DefaultEdge("ab"));
        path2.add(new DefaultEdge("ab"));
        Assert.assertEquals(path1, path2);
        path1.add(new DefaultEdge("bc"));
        path2.add(new DefaultEdge("bc"));
        Assert.assertEquals(path1, path2);
        path1.add(new DefaultEdge("cd"));
        path2.add(new DefaultEdge("cd"));
        Assert.assertEquals(path1, path2);
    }
}