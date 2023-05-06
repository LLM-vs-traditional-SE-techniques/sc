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


public class CodexTest_0_9_17 { 
    @Test
    public void testCloneWithDifferentRoot() {
        Graph<Integer> circle = createCircularGraph(1);
        Iterator<? extends Integer> it = circle.getNodeIterator();
        Integer previous = it.next();
        while (it.hasNext()) {
            Integer current = it.next();
            circle.addEdge(previous, current);
            previous = current;
        }
        circle.addEdge(previous, 1);
        Path<Integer> path = new Path<>(circle, previous);
        Integer root = 1;
        path.setRoot(root);
        Path<Integer> copy = path.clone();
        assertEquals(path.getLength(), copy.getLength());
        path.setRoot(previous);
        int length = path.getLength();
        path.add(root);
        assertEquals(length + 1, path.getLength());
        path.setRoot(root);
        assertEquals(length + 1, path.getLength());
        path.setRoot(previous);
        assertEquals(length + 1, path.getLength());
    }
}