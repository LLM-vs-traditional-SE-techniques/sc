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


public class CodexTest_0_6_71 { 
    @Test
    public void equals_givenTwoPathsWithSameNodesWhichAreInSameOrder_shouldReturnTrue() {
        // given
        Path path1 = new Path();
        Path path2 = new Path();
        Node node1 = new DefaultNode(a);
        Node node2 = new DefaultNode(b);
        Node node3 = new DefaultNode(c);
        Node node4 = new DefaultNode(d);
        path1.add(node1);
        path1.add(node2);
        path1.add(node3);
        path1.add(node4);
        path2.add(node1);
        path2.add(node2);
        path2.add(node3);
        path2.add(node4);
        // when
        boolean result = path1.equals(path2);
        // then
        assertTrue(result);
    }
}