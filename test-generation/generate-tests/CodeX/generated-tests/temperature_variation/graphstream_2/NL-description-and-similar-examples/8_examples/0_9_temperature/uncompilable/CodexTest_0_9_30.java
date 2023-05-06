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


public class CodexTest_0_9_30 { 
  @Test
    public void testSimpleEquals_NodePath() {
        Path p1=new Path();
        Path p2=new Path();
        p1.setRoot(graph.getNode(a));
        Assert.assertEquals(p1, p2);
        p2.setRoot(graph.getNode(a));
        Assert.assertEquals(p1, p2);
    }

}