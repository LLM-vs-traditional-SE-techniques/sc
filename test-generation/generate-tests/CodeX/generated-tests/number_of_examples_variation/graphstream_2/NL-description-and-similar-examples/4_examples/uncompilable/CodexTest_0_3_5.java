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


public class CodexTest_0_3_5 { 
    @Test
    public void equals_whenPathsAreEqual_shouldReturnTrue() {
        // given
        Path path = new Path();
        path.add(new Node("A"));
        path.add(new Node("B"));
        path.add(new Node("C"));
        Path path2 = new Path();
        path2.add(new Node("A"));
        path2.add(new Node("B"));
        path2.add(new Node("C"));
        // when
        boolean result = path.equals(path2);
        // then
        assertTrue(result);
    }
}